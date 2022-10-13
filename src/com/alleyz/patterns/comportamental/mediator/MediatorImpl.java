package com.alleyz.patterns.comportamental.mediator;

import com.alleyz.patterns.Pattern;
import com.alleyz.patterns.comportamental.mediator.sender.EmailSender;

public class MediatorImpl implements Pattern {

    @Override
    public String getPatternName() {
        return "MEDIATOR";
    }

    @Override
    public void execute() {
        this.printStartMessage();

        MessageMediator mediator = new MessageMediator();

        EmailSender email = new EmailSender();
        email.notify(mediator);
    }

}
