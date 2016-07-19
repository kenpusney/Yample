package net.kimleo.yample.ast.application;

import com.fasterxml.jackson.annotation.JsonProperty;
import net.kimleo.yample.ast.Application;

public class CondAppl extends Application {
    Application when;
    Application then;
    @JsonProperty("else")
    Application _else;

    public Application getWhen() {
        return when;
    }

    public void setWhen(Application when) {
        this.when = when;
    }

    public Application getThen() {
        return then;
    }

    public void setThen(Application then) {
        this.then = then;
    }

    public Application getElse() {
        return _else;
    }

    public void setElse(Application _else) {
        this._else = _else;
    }
}
