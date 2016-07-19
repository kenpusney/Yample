package net.kimleo.yample.ast.declaration;

import net.kimleo.yample.ast.Declaration;

import java.util.List;

public class ModuleDecl extends Declaration {
    String name;
    List<String> exports;
    List<Declaration> declarations;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getExports() {
        return exports;
    }

    public void setExports(List<String> exports) {
        this.exports = exports;
    }

    public List<Declaration> getDeclarations() {
        return declarations;
    }

    public void setDeclarations(List<Declaration> declarations) {
        this.declarations = declarations;
    }
}
