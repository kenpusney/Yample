package net.kimleo.yample.ast.declaration;

import net.kimleo.yample.ast.Declaration;

public class AliasDecl extends Declaration{
    String use;
    String as;

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getAs() {
        return as;
    }

    public void setAs(String as) {
        this.as = as;
    }
}
