package net.kimleo.yample;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import net.kimleo.yample.ast.Declaration;
import org.junit.Test;
import org.xml.sax.ext.DeclHandler;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class YampleApplicationTest {
    @Test
    public void testHelloWorld() throws Exception {
        String source = getResourceContent("01-hello-world.yml");
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());

        Declaration[] declarations = objectMapper.readValue(source, Declaration[].class);
        System.out.println(declarations);
        System.out.println(source);
    }

    @Test
    public void testFuncDefinition() throws Exception {
        String source = getResourceContent("02-func.yml");
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());

        Declaration[] declarations = objectMapper.readValue(source, Declaration[].class);
        System.out.println(declarations);
    }

    @Test
    public void testTypeDefinition() throws Exception {
        String source = getResourceContent("03-type.yml");
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());

        Declaration[] declarations = objectMapper.readValue(source, Declaration[].class);
        System.out.println(declarations);
    }

    private String getResourceContent(String name) {
        InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream(name);
        BufferedReader reader = new BufferedReader(new InputStreamReader(resourceAsStream));
        return reader.lines().collect(Collectors.joining("\n"));
    }
}