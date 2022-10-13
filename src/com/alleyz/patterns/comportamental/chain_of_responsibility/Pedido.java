package com.alleyz.patterns.comportamental.chain_of_responsibility;

import java.time.LocalDate;

public class Pedido {

    private final Vendedor vendedor;
    private final double valorVenda;
    private final LocalDate dataVenda;

    private Status status;

    public Pedido(Vendedor vendedor, double valorVenda, LocalDate dataVenda, Status status) {
        this.vendedor = vendedor;
        this.valorVenda = valorVenda;
        this.dataVenda = dataVenda;
        this.status = status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Pedido{" +
            "vendedor=" + vendedor +
            ", valorVenda=" + valorVenda +
            ", dataVenda=" + dataVenda +
            ", status=" + status +
            '}';
    }

}
