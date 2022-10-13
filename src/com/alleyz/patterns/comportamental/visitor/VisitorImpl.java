package com.alleyz.patterns.comportamental.visitor;

import com.alleyz.patterns.Pattern;
import com.alleyz.patterns.comportamental.visitor.element.Cliente;
import com.alleyz.patterns.comportamental.visitor.element.Element;
import com.alleyz.patterns.comportamental.visitor.element.Produto;

import java.util.ArrayList;
import java.util.List;

public class VisitorImpl implements Pattern {

    @Override
    public void execute() {
        this.printStartMessage();

        Visitor visitor = new VendaVisitor();
        List<Element> elements = new ArrayList<>();

        elements.add(new Produto());
        elements.add(new Cliente());

        for(Element element : elements) {
            element.accept(visitor);

            System.out.println(element);
        }
    }

    @Override
    public String getPatternName() {
        return "VISITOR";
    }

}
