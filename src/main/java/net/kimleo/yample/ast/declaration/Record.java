package net.kimleo.yample.ast.declaration;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Record {
    String name;
    String type;
    @JsonProperty("with")
    List<String> modifiers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getModifiers() {
        return modifiers;
    }

    public void setModifiers(List<String> modifiers) {
        this.modifiers = modifiers;
    }
}
