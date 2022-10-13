package com.alleyz.patterns.comportamental.chain_of_responsibility;

import com.alleyz.patterns.Pattern;
import com.alleyz.patterns.comportamental.chain_of_responsibility.handler.ComissaoHandler;
import com.alleyz.patterns.comportamental.chain_of_responsibility.handler.Handler;
import com.alleyz.patterns.comportamental.chain_of_responsibility.handler.StatusHandler;

import java.time.LocalDate;

public class ChainOfResponsibilityImpl implements Pattern {

    @Override
    public String getPatternName() {
        return "CHAIN OF RESPONSIBILITY";
    }

    @Override
    public void execute() {
        this.printStartMessage();

        Pedido pedido = new Pedido(
            new Vendedor("Walter"),
            450.,
            LocalDate.now(),
            Status.NOVO
        );

        Handler handler = new ComissaoHandler();
        handler.setNext(new StatusHandler());

        handler.handle(pedido);

        System.out.println(pedido);
    }

}
