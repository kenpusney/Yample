package net.kimleo.yample.ast;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import net.kimleo.yample.ast.application.*;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "apply")
@JsonSubTypes({
        @JsonSubTypes.Type(value = ValueAppl.class, name = "value"),
        @JsonSubTypes.Type(value = FunAppl.class, name = "fun"),
        @JsonSubTypes.Type(value = DeclAppl.class, name = "decl"),
        @JsonSubTypes.Type(value = CondAppl.class, name = "cond"),
        @JsonSubTypes.Type(value = ExprAppl.class, name = "expr"),
        @JsonSubTypes.Type(value = VarAppl.class, name = "var"),
})
public class Application {
    String apply;
}
