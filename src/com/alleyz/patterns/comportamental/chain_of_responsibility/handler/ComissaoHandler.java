package com.alleyz.patterns.comportamental.chain_of_responsibility.handler;

import com.alleyz.patterns.comportamental.chain_of_responsibility.Pedido;

import java.util.Objects;

public class ComissaoHandler implements Handler {

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
        if(Objects.nonNull(pedido.getVendedor()) && pedido.getValorVenda() > 200.) {
            pedido.getVendedor().setRecebeComissao(true);
        }

        this.executeNext(pedido);
    }

}
