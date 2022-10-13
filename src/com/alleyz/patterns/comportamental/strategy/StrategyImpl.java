package com.alleyz.patterns.comportamental.strategy;

import com.alleyz.patterns.Pattern;
import com.alleyz.patterns.comportamental.strategy.pagamento.Debito;
import com.alleyz.patterns.comportamental.strategy.produto.ProdutoLimpeza;
import com.alleyz.patterns.comportamental.strategy.venda.Cliente;
import com.alleyz.patterns.comportamental.strategy.venda.Venda;

public class StrategyImpl implements Pattern {

    @Override
    public String getPatternName() {
        return "STRATEGY";
    }

    @Override
    public void execute() {
        this.printStartMessage();

        Venda venda = new Venda(
            new ProdutoLimpeza("Amaciante", 12.5),
            new Cliente("Walter"),
            5
        );

        // usando condicional
        venda.calcularValorVenda("credito");

        System.out.println(venda);

        // usando o strategy
        venda.calcularValorVenda(new Debito());

        System.out.println(venda);
    }

}
