package util;

import java.util.ArrayList;

import model.Conta;

public class TesteArrayListEquals {
    public static void main(String[] args) {

        //Generics
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta c = new Conta(55, 65);
        lista.add(c);

        Conta c2 = new Conta(34, 55);
        lista.add(c2);
        
        Conta c3 = new Conta(34, 55);
        boolean existe = lista.contains(c3);

        System.out.println("Já existe "+ existe);

        for(Object oRef : lista) {
            System.out.println(oRef);
        }
    }
}
