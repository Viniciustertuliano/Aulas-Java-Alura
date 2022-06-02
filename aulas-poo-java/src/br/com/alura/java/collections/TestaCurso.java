package br.com.alura.java.collections;

import java.util.List;

import model.Curso;
import model.Aula;

public class TestaCurso {
    public static void main(String[] args) {
        
        Curso javaColecoes = new Curso("Dominando as colecoes do Java",
                "Paulo Silveira");

        List<Aula> aulas = javaColecoes.getAulas();
        System.out.println(aulas);

        // adicione novas aulas na classe Curso
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));

//        javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));

        System.out.println(javaColecoes.getAulas());

        System.out.println(aulas);
    }
}
