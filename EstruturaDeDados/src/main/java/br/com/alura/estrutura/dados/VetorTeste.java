package br.com.alura.estrutura.dados;

public class VetorTeste {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("maria");
        Aluno aluno2 = new Aluno("pedro");
        Aluno aluno3 = new Aluno("fernando");

        Vetor lista = new Vetor();


        System.out.println(lista.tamanho());
        lista.adiciona(aluno1);
        System.out.println(lista.tamanho());
        lista.adiciona(aluno2);
        System.out.println(lista.tamanho());
        System.out.println(lista);
        System.out.println(lista.contem(aluno1));
        System.out.println(lista.contem(aluno3));
        System.out.println(lista.pega(0));
        lista.adicionaEmPosicao(1,aluno3);
        System.out.println(lista);
        lista.remove(0);
        System.out.println(lista);
        for(int i = 0; i < 300; i++) {
            Aluno y = new Aluno("Joao" + i);
            lista.adiciona(y);
        }
        System.out.println(lista);


    }
}
