package br.com.alura.estrutura.dados;

public class TestaListaLigada {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        System.out.println(lista);
        lista.adicionaNoComeco("mauricio");
        System.out.println(lista);
        lista.adicionaNoComeco("paulo");
        System.out.println(lista);
        lista.adicionaNoComeco("guilherme");
        System.out.println(lista);
        lista.adiciona("marcelo");
        System.out.println(lista);
        lista.adicionaEmPosicao(2, "gabriel");
        System.out.println(lista);
        System.out.println(lista.pega(2));
        System.out.println(lista.tamanho());
        lista.removeDoComeco();
        System.out.println(lista);

        lista.removeDoFim();
        System.out.println(lista);

        lista.remove(1);
        System.out.println(lista);

        System.out.println(lista.contem("paulo"));
        System.out.println(lista.contem("danilo"));
    }
}
