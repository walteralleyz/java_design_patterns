package com.alleyz.patterns.comportamental.strategy.produto;

public class ProdutoLimpeza implements Produto {

    private final String nome;
    private final double preco;

    public ProdutoLimpeza(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}
