package com.alleyz.patterns.criacional.factory.empresa;

public class Operadora implements Empresa {

    @Override
    public Tipo getTipoEmpresa() {
        return Tipo.TELEFONIA;
    }

}
