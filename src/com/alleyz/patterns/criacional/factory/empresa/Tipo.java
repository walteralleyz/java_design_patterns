package com.alleyz.patterns.criacional.factory.empresa;

import java.util.Random;

public enum Tipo {
    COMERCIO, INDUSTRIA, TELEFONIA;

    public static Tipo obterTipoRandom() {
        Random random = new Random();
        int index = random.nextInt(3);

        return switch (index) {
            case 0 -> Tipo.COMERCIO;
            case 1 -> Tipo.INDUSTRIA;
            default -> Tipo.TELEFONIA;
        };
    }
}
