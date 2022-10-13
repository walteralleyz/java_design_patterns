package com.alleyz.patterns.comportamental.memento;

public class FormUsuarioSnapshot implements FormUsuarioMemento {

    private final FormUsuario formUsuario;
    private final String nome;
    private final int idade;
    private final boolean vivo;

    public FormUsuarioSnapshot(FormUsuario formUsuario, String nome, int idade, boolean vivo) {
        this.formUsuario = formUsuario;
        this.nome = nome;
        this.idade = idade;
        this.vivo = vivo;
    }

    @Override
    public void restore() {
        this.formUsuario.setNome(this.nome);
        this.formUsuario.setIdade(this.idade);
        this.formUsuario.setVivo(this.vivo);
    }

}
