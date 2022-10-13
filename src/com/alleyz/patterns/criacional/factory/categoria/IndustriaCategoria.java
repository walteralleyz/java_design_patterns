package com.alleyz.patterns.criacional.factory.categoria;

import com.alleyz.patterns.criacional.factory.empresa.Empresa;
import com.alleyz.patterns.criacional.factory.empresa.Montadora;

public class IndustriaCategoria implements Categoria {

    @Override
    public Empresa criarEmpresa() {
        return new Montadora();
    }

}
