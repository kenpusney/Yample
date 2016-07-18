package net.kimleo.yample.ast;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import net.kimleo.yample.ast.declaration.AliasDecl;
import net.kimleo.yample.ast.declaration.FunDecl;
import net.kimleo.yample.ast.declaration.MainDecl;
import net.kimleo.yample.ast.declaration.StructDecl;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "decl")
@JsonSubTypes({
        @JsonSubTypes.Type(value = MainDecl.class, name = "main"),
        @JsonSubTypes.Type(value = FunDecl.class, name = "fun"),
        @JsonSubTypes.Type(value = StructDecl.class, name = "struct"),
        @JsonSubTypes.Type(value = AliasDecl.class, name = "alias"),
})
public class Declaration {
    String decl;
}
