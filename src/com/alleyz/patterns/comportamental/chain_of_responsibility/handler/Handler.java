package com.alleyz.patterns.comportamental.chain_of_responsibility.handler;

import com.alleyz.patterns.comportamental.chain_of_responsibility.Pedido;

import java.util.Objects;

public interface Handler {

    void setNext(Handler handler);

    Handler getNext();

    void handle(Pedido pedido);

    default void executeNext(Pedido pedido) {
        if(Objects.nonNull(getNext())) {
            getNext().handle(pedido);
        }
    }
}
