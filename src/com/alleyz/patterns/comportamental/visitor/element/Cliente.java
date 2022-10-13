package com.alleyz.patterns.comportamental.visitor.element;

import com.alleyz.patterns.comportamental.visitor.Visitor;

public class Cliente implements Element {

    private String nome;

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
            "nome='" + nome + '\'' +
            '}';
    }
}
