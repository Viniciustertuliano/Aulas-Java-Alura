package br.com.alura.estrutura.dados;

import java.util.Objects;

public class Aluno {

    private String nome;

    public Aluno(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome);
    }

    @Override
    public String toString() {
        return nome;
    }
}
