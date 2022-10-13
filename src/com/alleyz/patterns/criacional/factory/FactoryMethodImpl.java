package com.alleyz.patterns.criacional.factory;

import com.alleyz.patterns.Pattern;
import com.alleyz.patterns.criacional.factory.categoria.ComercioCategoria;
import com.alleyz.patterns.criacional.factory.categoria.IndustriaCategoria;
import com.alleyz.patterns.criacional.factory.categoria.TelefoniaCategoria;
import com.alleyz.patterns.criacional.factory.empresa.Empresa;
import com.alleyz.patterns.criacional.factory.empresa.Tipo;

public class FactoryMethodImpl implements Pattern {

    @Override
    public void execute() {
        this.printStartMessage();

        Tipo tipo = Tipo.obterTipoRandom();

        Empresa empresa = switch (tipo) {
            case COMERCIO -> new ComercioCategoria().criarEmpresa();
            case INDUSTRIA -> new IndustriaCategoria().criarEmpresa();
            default -> new TelefoniaCategoria().criarEmpresa();
        };

        System.out.println(empresa.getTipoEmpresa());
    }

    @Override
    public String getPatternName() {
        return "FACTORY METHOD";
    }

}
