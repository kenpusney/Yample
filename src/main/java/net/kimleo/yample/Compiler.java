package net.kimleo.yample;

import com.fasterxml.jackson.databind.ObjectMapper;
import net.kimleo.yample.ast.Declaration;

import java.io.IOException;

public class Compiler {

    private final ObjectMapper inputMapper;
    private final ObjectMapper outputMapper;

    public Compiler(ObjectMapper inputMapper, ObjectMapper outputMapper) {
        this.inputMapper = inputMapper;
        this.outputMapper = outputMapper;
    }

    public String convert(String source) {
        try {
            Declaration[] declarations = compile(source);
            return outputMapper.writeValueAsString(declarations);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return source;
    }

    public Declaration[] compile(String source) throws IOException {
        return inputMapper.readValue(source, Declaration[].class);
    }
}
