package com.alleyz.patterns.comportamental.chain_of_responsibility.handler;

import com.alleyz.patterns.comportamental.chain_of_responsibility.Pedido;
import com.alleyz.patterns.comportamental.chain_of_responsibility.Status;

import java.time.LocalDate;
import java.util.Objects;

public class StatusHandler implements Handler {

    private Handler next;

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public Handler getNext() {
        return this.next;
    }

    @Override
    public void handle(Pedido pedido) {
        if(pedido.getDataVenda().isAfter(LocalDate.now().minusDays(1))
            && Status.NOVO.equals(pedido.getStatus())) {
            pedido.setStatus(Status.CONCLUIDO);
        }

        this.executeNext(pedido);
    }

}
