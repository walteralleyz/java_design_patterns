package com.alleyz.patterns.criacional.factory.categoria;

import com.alleyz.patterns.criacional.factory.empresa.Empresa;
import com.alleyz.patterns.criacional.factory.empresa.Operadora;

public class TelefoniaCategoria implements Categoria {

    @Override
    public Empresa criarEmpresa() {
        return new Operadora();
    }

}
