package com.alleyz.patterns.comportamental.strategy.venda;

import com.alleyz.patterns.comportamental.strategy.pagamento.MetodoPagamento;
import com.alleyz.patterns.comportamental.strategy.produto.Produto;

public class Venda {

    private final Produto produto;
    private final Cliente cliente;
    private final int quantidade;

    private double valorVenda;

    public Venda(Produto produto, Cliente cliente, int quantidade) {
        this.produto = produto;
        this.cliente = cliente;
        this.quantidade = quantidade;
    }

    // calcular o valor de venda utilizando condicionais
    // essa implementacao dificulta a manutencao, pois cresce de acordo
    // com a adicao de tipos de pagamento
    public void calcularValorVenda(String pagamento) {
        double porcentagem = switch (pagamento) {
            case "credito" -> .2;
            case "debito" -> .45;
            case "dinheiro" -> .7;
            default -> throw new IllegalArgumentException("Metodo pagamento nao existe!");
        };

        double desconto = this.produto.getPreco() * porcentagem;
        this.valorVenda = (this.produto.getPreco() - desconto) * this.quantidade;
    }

    // o padrao strategy facilita tudo
    // ja que, podemos simplesmente delegar a responsabilidade de definir
    // regras, trocando a implementacao
    public void calcularValorVenda(MetodoPagamento pagamento) {
        double desconto = this.produto.getPreco() * pagamento.getPorcentagemDesconto();
        this.valorVenda = (this.produto.getPreco() - desconto) * this.quantidade;
    }

    @Override
    public String toString() {
        return String.format(
            "Cliente: %s%nProduto: %s%nValor: %s%n",
            this.cliente.getNome(),
            this.produto.getNome(),
            this.valorVenda);
    }

}
