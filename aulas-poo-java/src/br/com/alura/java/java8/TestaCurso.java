package br.com.alura.java.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestaCurso {

    private String nome;
    private int alunos;

    public TestaCurso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
}

class TestaStream{
    public static void main(String[] args) {
        List<TestaCurso> cursos = new ArrayList<TestaCurso>();
        cursos.add(new TestaCurso("Python", 45));
        cursos.add(new TestaCurso("JavaScript", 150));
        cursos.add(new TestaCurso("Java 8", 113));
        cursos.add(new TestaCurso("C", 55));

        cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));

        //Com method reference
        cursos.sort(Comparator.comparingInt(TestaCurso::getAlunos));
        
        Stream<TestaCurso> streamDeCurso = cursos.stream().filter(c -> c.getAlunos() > 100);
        cursos.forEach(c -> System.out.println(c.getNome()));

        System.out.println("------");

        streamDeCurso.forEach(c -> System.out.println(c.getNome()));

        System.out.println("------");

        cursos.stream()
        .filter(c -> c.getAlunos() > 100)
        .forEach(c -> System.out.println(c.getNome()));

        System.out.println("------");

        cursos.stream()
        .filter(c -> c.getAlunos() > 100)
        .map(TestaCurso::getAlunos)
        .forEach(System.out::println);

        System.out.println("------");

        int soma = cursos.stream()
        .filter(c -> c.getAlunos() > 100)
        .mapToInt(TestaCurso::getAlunos)
        .sum();
        System.out.println(soma);

        System.out.println("------");

        cursos.stream()
        .filter(c -> c.getAlunos() > 100)
        .findAny();
            

//        Optional<TestaCurso> optionalCurso = cursos.stream()
//            .filter(c -> c.getAlunos() > 100)
//            .findAny();

//        TestaCurso curso = optionalCurso.get();

//        TestaCurso curso = optionalCurso.orElse(null);

//        optionalCurso.ifPresent(c -> System.out.println(c.getNome()));

        cursos.stream()
        .filter(c -> c.getAlunos() > 100)
        .findAny()
        .ifPresent(c -> System.out.println(c.getNome()));

        System.out.println("------");

        List<TestaCurso> resultados = cursos.stream()
        .filter(c -> c.getAlunos() > 100)
        .collect(Collectors.toList());

        resultados.forEach(r -> System.out.println(r.getNome()));
        System.out.println("------");

        Map mapa = cursos
        .stream() 
        .filter(c -> c.getAlunos() > 100) 
        .collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()));
        System.out.println(mapa);

        System.out.println("------");
        
        cursos.stream()
        .mapToInt(c -> c.getAlunos())
        .average();
    }
}