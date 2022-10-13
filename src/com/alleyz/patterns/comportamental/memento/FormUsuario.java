package com.alleyz.patterns.comportamental.memento;

public class FormUsuario {

    private String nome;
    private int idade;
    private boolean vivo;

    public FormUsuario(String nome, int idade, boolean vivo) {
        this.nome = nome;
        this.idade = idade;
        this.vivo = vivo;
    }

    public FormUsuarioMemento save() {
        return new FormUsuarioSnapshot(
            this,
            this.nome,
            this.idade,
            this.vivo
        );
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    @Override
    public String toString() {
        return "FormUsuario{" +
            "nome='" + nome + '\'' +
            ", idade=" + idade +
            ", vivo=" + vivo +
            '}';
    }
}
