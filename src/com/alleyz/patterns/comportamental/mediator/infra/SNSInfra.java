package com.alleyz.patterns.comportamental.mediator.infra;

public class SNSInfra implements Infra {

    @Override
    public void doSend() {
        System.out.println("Enviando via servico de SNS");
    }

}
