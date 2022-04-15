package br.com.alura.java.collections;

import java.util.HashSet;
import java.util.Set;

public class TesteAlunos {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();

        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");
        alunos.add("Nico");

        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        System.out.println(alunos.size());
        alunos.add("Nico");
        System.out.println(alunos.size());
    }
}
