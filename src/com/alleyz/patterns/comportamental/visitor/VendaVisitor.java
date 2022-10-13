package com.alleyz.patterns.comportamental.visitor;

import com.alleyz.patterns.comportamental.visitor.element.Cliente;
import com.alleyz.patterns.comportamental.visitor.element.Produto;

public class VendaVisitor implements Visitor {

    @Override
    public void visit(Produto produto) {
        produto.setDisponivel(true);
    }

    @Override
    public void visit(Cliente cliente) {
        cliente.setNome("Walter");
    }

}
