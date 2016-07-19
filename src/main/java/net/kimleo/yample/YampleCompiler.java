package net.kimleo.yample;

import com.fasterxml.jackson.databind.ObjectMapper;
import net.kimleo.yample.ast.Declaration;

import java.io.IOException;

public class YampleCompiler {

    private final ObjectMapper inputMapper;
    private final ObjectMapper outputMapper;

    public YampleCompiler(ObjectMapper inputMapper, ObjectMapper outputMapper) {
        this.inputMapper = inputMapper;
        this.outputMapper = outputMapper;
    }

    public void compile(String source) {
        try {
            Declaration[] declarations = inputMapper.readValue(source, Declaration[].class);
            System.out.println(outputMapper.writeValueAsString(declarations));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
