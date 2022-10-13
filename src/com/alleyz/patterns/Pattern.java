package com.alleyz.patterns;

public interface Pattern {
    void execute();

    String getPatternName();

    default void printStartMessage() {
        System.out.println("=".repeat(20));
        System.out.println("Executando padrao " + getPatternName());
    }
}
