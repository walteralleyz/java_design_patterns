package com.alleyz.patterns;

import com.alleyz.patterns.comportamental.chain_of_responsibility.ChainOfResponsibilityImpl;
import com.alleyz.patterns.comportamental.mediator.MediatorImpl;
import com.alleyz.patterns.comportamental.memento.MementoImpl;
import com.alleyz.patterns.comportamental.strategy.StrategyImpl;
import com.alleyz.patterns.comportamental.visitor.VisitorImpl;
import com.alleyz.patterns.criacional.factory.FactoryMethodImpl;
import com.alleyz.patterns.estrutural.adapter.AdapterImpl;

import java.util.ArrayList;
import java.util.List;

public class MainApplication {

    private final static List<Pattern> patterns = new ArrayList<>();

    static {
        patterns.add(new StrategyImpl());
        patterns.add(new ChainOfResponsibilityImpl());
        patterns.add(new MediatorImpl());
        patterns.add(new MementoImpl());
        patterns.add(new VisitorImpl());
        patterns.add(new AdapterImpl());
        patterns.add(new FactoryMethodImpl());
    }

    public static void main(String[] args) {
        patterns.forEach(Pattern::execute);
    }

}
