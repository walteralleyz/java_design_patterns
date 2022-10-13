package com.alleyz.patterns.comportamental.strategy.pagamento;

public class Credito implements MetodoPagamento {

    @Override
    public double getPorcentagemDesconto() {
        return .2;
    }

}
