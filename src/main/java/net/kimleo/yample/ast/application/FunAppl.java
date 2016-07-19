package net.kimleo.yample.ast.application;

import net.kimleo.yample.ast.Application;

import java.util.List;

public class FunAppl extends Application {
    String name;
    List<Application> args;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Application> getArgs() {
        return args;
    }

    public void setArgs(List<Application> args) {
        this.args = args;
    }
}
