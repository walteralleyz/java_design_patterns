package com.alleyz.patterns.criacional.factory.empresa;

public class Montadora implements Empresa {

    @Override
    public Tipo getTipoEmpresa() {
        return Tipo.INDUSTRIA;
    }

}
