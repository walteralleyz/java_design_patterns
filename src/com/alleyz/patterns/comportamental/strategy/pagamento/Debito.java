package com.alleyz.patterns.comportamental.strategy.pagamento;

public class Debito implements MetodoPagamento {

    @Override
    public double getPorcentagemDesconto() {
        return .45;
    }

}
