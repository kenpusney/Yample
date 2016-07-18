package net.kimleo.yample.ast.declaration;

import com.fasterxml.jackson.annotation.JsonProperty;
import net.kimleo.yample.ast.Declaration;

import java.util.List;

public class StructDecl extends Declaration {
    String name;
    List<TypeParam> params;
    @JsonProperty("with")
    List<Record> records;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TypeParam> getParams() {
        return params;
    }

    public void setParams(List<TypeParam> params) {
        this.params = params;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }
}
