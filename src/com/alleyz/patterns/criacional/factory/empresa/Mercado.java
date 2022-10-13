package com.alleyz.patterns.criacional.factory.empresa;

public class Mercado implements Empresa {

    @Override
    public Tipo getTipoEmpresa() {
        return Tipo.COMERCIO;
    }

}
