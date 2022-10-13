package com.alleyz.patterns.comportamental.mediator;

import com.alleyz.patterns.comportamental.mediator.infra.EmailInfra;
import com.alleyz.patterns.comportamental.mediator.infra.Infra;
import com.alleyz.patterns.comportamental.mediator.infra.SNSInfra;
import com.alleyz.patterns.comportamental.mediator.sender.EmailSender;
import com.alleyz.patterns.comportamental.mediator.sender.SNSSender;
import com.alleyz.patterns.comportamental.mediator.sender.Sender;

public enum SenderInfraFactory {

    EMAIL(EmailSender.class, EmailInfra::new),
    SNS(SNSSender.class, SNSInfra::new);

    private final Class<? extends Sender> senderClass;
    private final BuildInfra buildInfra;

    SenderInfraFactory(Class<? extends Sender> senderClass, BuildInfra buildInfra) {
        this.senderClass = senderClass;
        this.buildInfra = buildInfra;
    }

    public static Infra getInfraBySender(Class<? extends Sender> senderClass) {
        for(SenderInfraFactory infraFactory : SenderInfraFactory.values()) {
            if(infraFactory.senderClass == senderClass) {
                return infraFactory.buildInfra.create();
            }
        }

        return null;
    }

    interface BuildInfra {
        Infra create();
    }
}
