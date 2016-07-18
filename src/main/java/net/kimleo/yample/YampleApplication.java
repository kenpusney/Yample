package net.kimleo.yample;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import net.kimleo.yample.ast.Declaration;

import java.io.*;
import java.util.stream.Collectors;

public class YampleApplication {

    private final ObjectMapper inputMapper;
    private final ObjectMapper outputMapper;

    public YampleApplication(ObjectMapper inputMapper, ObjectMapper outputMapper) {
        this.inputMapper = inputMapper;
        this.outputMapper = outputMapper;
    }

    public static void main(String[] args) {
        YampleApplication application = new YampleApplication(new ObjectMapper(new YAMLFactory()), new ObjectMapper(new JsonFactory()));
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
                String source = readSource(file);
                compile(source);
            }
        }
    }

    private static String readSource(File file) {
        try {
            return new BufferedReader(new InputStreamReader(new FileInputStream(file))).lines().collect(Collectors.joining("\n"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(String.format("Unable to readl file %s", file), e);
        }
    }

    private void compile(String source) {
        try {
            Declaration[] declarations = inputMapper.readValue(source, Declaration[].class);
            System.out.println(outputMapper.writeValueAsString(declarations));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
