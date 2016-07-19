package net.kimleo.yample.ast.application;

import net.kimleo.yample.ast.Application;

public class ValueAppl extends Application {
    String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
