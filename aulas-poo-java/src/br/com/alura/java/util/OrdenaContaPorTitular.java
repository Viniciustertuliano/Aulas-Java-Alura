package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.Conta;
import model.Cliente;

public class OrdenaContaPorTitular {

        public static void main(String[] args) {

            Conta c1 = new Conta(22, 33);
            Cliente clienteC1 = new Cliente();
            clienteC1.setNome("Nico");
            c1.setTitular(clienteC1);
            c1.deposita(333.0);

            Conta c2 = new Conta(22, 44);
            Cliente clienteC2 = new Cliente();
            clienteC2.setNome("Guilherme");
            c2.setTitular(clienteC2);
            c2.deposita(444.0);

            Conta c3 = new Conta(22, 11);
            Cliente clienteC3 = new Cliente();
            clienteC3.setNome("Paulo");
            c3.setTitular(clienteC3);
            c3.deposita(111.0);

            Conta c4 = new Conta(22, 22);
            Cliente clienteC4 = new Cliente();
            clienteC4.setNome("Ana");
            c4.setTitular(clienteC4);
            c4.deposita(222.0);

                List<Conta> lista = new ArrayList<>();
                lista.add(c1);
                lista.add(c2);
                lista.add(c3);
                lista.add(c4);

                for (Conta conta : lista) {
                    System.out.println(conta);
                }

//                NumeroDaContaComparator comparator = new NumeroDaContaComparator();
                lista.sort(new TitularDaContaComparator());

//              Collections.sort(lista, NumeroDaContaComparator);
                Collections.sort(lista);
                Collections.reverse(lista);

                System.out.println("-------------");

                for (Conta conta : lista) {
                    System.out.println(conta +", "+conta.getTitular().getNome());
                }



        }

}

class TitularDaContaComparator implements Comparator<Conta>{

    @Override
    public int compare(Conta c1, Conta c2) {
        String nomeC1 = c1.getTitular().getNome();
        String nomeC2 = c2.getTitular().getNome();

        return nomeC1.compareTo(nomeC2);
    }
}

class NumeroDaContaComparator implements Comparator<Conta>{

    @Override
    public int compare(Conta c1, Conta c2) {

        return Integer.compare(c1.getNumero(), c2.getNumero());

//        return c1.getNumero() - c2.getNumero();

//        if(c1.getNumero() < c2.getNumero()){
//            return -1;
//        }

//        if(c1.getNumero() > c2.getNumero()){
//            return 1;
//        }

//        return 0;
    }
    
}