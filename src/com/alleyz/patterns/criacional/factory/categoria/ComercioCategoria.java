package com.alleyz.patterns.criacional.factory.categoria;

import com.alleyz.patterns.criacional.factory.empresa.Empresa;
import com.alleyz.patterns.criacional.factory.empresa.Mercado;

public class ComercioCategoria implements Categoria {

    @Override
    public Empresa criarEmpresa() {
        return new Mercado();
    }

}
