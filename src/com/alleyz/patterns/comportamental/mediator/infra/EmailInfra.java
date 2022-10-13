package com.alleyz.patterns.comportamental.mediator.infra;

public class EmailInfra implements Infra {

    @Override
    public void doSend() {
        System.out.println("Enviando via servico de EMAIL");
    }

}
