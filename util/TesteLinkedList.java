package util;

import java.util.ArrayList;

import model.Conta;

public class TesteLinkedList {
    public static void main(String[] args) {

        

        //Generics
        ArrayList<Conta> lista = new ArrayList<Conta>();

        ArrayList<String> nomes = new ArrayList<String>();

        Conta cc = new Conta(55, 65);
        lista.add(cc);

        Conta cc2 = new Conta(34, 55);
        lista.add(cc2);

        System.out.println("Tamanho: " + lista.size());

        Conta ref = (Conta) lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);
        System.out.println("Tamanho: " + lista.size());

        Conta cc3 = new Conta(32, 44);
        lista.add(cc3);

        Conta cc4 = new Conta(53, 67);
        lista.add(cc4);

        for(int i = 0; i < lista.size(); i++) {
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        System.out.println("----------");

        for(Object oRef : lista) {
            System.out.println(oRef);
        }

        System.out.println(nomes.size());

    }
}
