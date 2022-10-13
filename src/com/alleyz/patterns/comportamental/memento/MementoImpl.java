package com.alleyz.patterns.comportamental.memento;

import com.alleyz.patterns.Pattern;

import java.util.ArrayList;
import java.util.List;

public class MementoImpl implements Pattern {
    @Override
    public void execute() {
        this.printStartMessage();

        List<FormUsuarioMemento> mementos = new ArrayList<>();

        FormUsuario usuario = new FormUsuario("Walter", 26, true);

        System.out.println(usuario);

        mementos.add(usuario.save());

        usuario.setIdade(27);

        System.out.println(usuario);

        mementos.get(0).restore();

        System.out.println(usuario);
    }

    @Override
    public String getPatternName() {
        return "MEMENTO";
    }
}
