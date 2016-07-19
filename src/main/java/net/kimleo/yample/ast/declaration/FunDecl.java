package net.kimleo.yample.ast.declaration;

import net.kimleo.yample.ast.Application;
import net.kimleo.yample.ast.Declaration;

import java.util.List;

public class FunDecl extends Declaration {
    String name;
    List<String> params;
    List<Application> actions;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getParams() {
        return params;
    }

    public void setParams(List<String> params) {
        this.params = params;
    }

    public List<Application> getActions() {
        return actions;
    }

    public void setActions(List<Application> actions) {
        this.actions = actions;
    }
}
