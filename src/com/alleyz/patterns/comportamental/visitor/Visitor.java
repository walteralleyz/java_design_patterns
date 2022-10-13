package com.alleyz.patterns.comportamental.visitor;

import com.alleyz.patterns.comportamental.visitor.element.Cliente;
import com.alleyz.patterns.comportamental.visitor.element.Produto;

public interface Visitor {

    void visit(Produto produto);

    void visit(Cliente cliente);

}
