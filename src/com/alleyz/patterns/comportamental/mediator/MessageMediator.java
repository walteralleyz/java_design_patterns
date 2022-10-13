package com.alleyz.patterns.comportamental.mediator;

import com.alleyz.patterns.comportamental.mediator.infra.Infra;
import com.alleyz.patterns.comportamental.mediator.sender.Sender;

import java.util.Objects;

public class MessageMediator {

    public void execute(Sender sender) {
        Infra infra = SenderInfraFactory.getInfraBySender(sender.getClass());

        if(Objects.isNull(infra)) {
            throw new IllegalArgumentException("Falha ao criar infra");
        }

        infra.doSend();
    }

}
