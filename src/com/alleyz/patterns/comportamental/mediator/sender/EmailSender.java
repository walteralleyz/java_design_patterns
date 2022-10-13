package com.alleyz.patterns.comportamental.mediator.sender;

import com.alleyz.patterns.comportamental.mediator.MessageMediator;

public class EmailSender implements Sender {

    @Override
    public void notify(MessageMediator mediator) {
        mediator.execute(this);
    }

}
