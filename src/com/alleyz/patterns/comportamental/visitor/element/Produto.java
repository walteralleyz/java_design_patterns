package com.alleyz.patterns.comportamental.visitor.element;

import com.alleyz.patterns.comportamental.visitor.Visitor;

public class Produto implements Element {

    private boolean disponivel;

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    @Override
    public String toString() {
        return "Produto{" +
            "disponivel=" + disponivel +
            '}';
    }
}
