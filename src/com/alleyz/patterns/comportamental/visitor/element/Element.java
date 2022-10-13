package com.alleyz.patterns.comportamental.visitor.element;

import com.alleyz.patterns.comportamental.visitor.Visitor;

public interface Element {

    void accept(Visitor v);

}
