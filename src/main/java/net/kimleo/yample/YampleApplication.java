package net.kimleo.yample;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import net.kimleo.commons.io.Resources;

import java.io.*;

public class YampleApplication {

    private final YampleCompiler yampleCompiler;

    public YampleApplication(YampleCompiler yampleCompiler) {
        this.yampleCompiler = yampleCompiler;
    }

    public static void main(String[] args) {
        final ObjectMapper inputMapper = new ObjectMapper(new YAMLFactory());
        final ObjectMapper outputMapper = new ObjectMapper(new JsonFactory());
        YampleCompiler compiler = new YampleCompiler(inputMapper, outputMapper);
        YampleApplication application = new YampleApplication(compiler);
        application.run(args);
    }

    private void run(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: yample <file>");
        } else {
            String fileName = args[0];
            File file = new File(fileName);
            if (!file.exists()) {
                System.out.println("Error: File not exists!");
            } else {
                String source = Resources.getFileContent(file);
                yampleCompiler.compile(source);
            }
        }
    }

}
