package util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import model.Conta;

public class OrdenaReferenciaConta {

        public static void main(String[] args) {

                Conta c1 = new Conta(22, 33);
                c1.deposita(333.0);

                Conta c2 = new Conta(22, 44);
                c2.deposita(444.0);

                Conta c3 = new Conta(22, 11);
                c3.deposita(111.0);

                Conta c4 = new Conta(22, 22);
                c4.deposita(222.0);

                List<Conta> lista = new ArrayList<>();
                lista.add(c1);
                lista.add(c2);
                lista.add(c3);
                lista.add(c4);

                for (Conta conta : lista) {
                    System.out.println(conta);
                }

                NumeroDaContaComparator comparator = new NumeroDaContaComparator();
                lista.sort(comparator);

                System.out.println("-------------");

                for (Conta conta : lista) {
                    System.out.println(conta);
                }
        }

}

class NumeroDaContaComparator implements Comparator<Conta>{

    @Override
    public int compare(Conta c1, Conta c2) {
        if(c1.getNumero() < c2.getNumero()){
            return -1;
        }

        if(c1.getNumero() > c2.getNumero()){
            return 1;
        }

        return 0;
    }
    
}