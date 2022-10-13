package com.alleyz.patterns.comportamental.mediator.sender;

import com.alleyz.patterns.comportamental.mediator.MessageMediator;

public interface Sender {

    void notify(MessageMediator mediator);

}
