package net.kimleo.yample.ast.declaration;

import net.kimleo.yample.ast.Application;
import net.kimleo.yample.ast.Declaration;

public class MainDecl extends Declaration {
    Application action;

    public Application getAction() {
        return action;
    }

    public void setAction(Application action) {
        this.action = action;
    }
}
