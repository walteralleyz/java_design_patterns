package com.alleyz.patterns.comportamental.chain_of_responsibility;

public class Vendedor {

    private final String nome;
    private boolean recebeComissao;

    public Vendedor(String nome) {
        this.nome = nome;
    }

    public void setRecebeComissao(boolean recebeComissao) {
        this.recebeComissao = recebeComissao;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
            "nome='" + nome + '\'' +
            ", recebeComissao=" + recebeComissao +
            '}';
    }
}
