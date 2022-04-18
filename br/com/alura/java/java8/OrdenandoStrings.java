package br.com.alura.java.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenandoStrings{
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();

        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");

        //versao java 8
        palavras.sort(( s1, s2) -> Integer.compare(s1.length(), s2.length()));
        palavras.sort(Comparator.comparing(String::length));
        System.out.println(palavras);

        //versao java 8
        palavras.forEach(s -> System.out.println(s));
        palavras.forEach(System.out::println);
    }
}