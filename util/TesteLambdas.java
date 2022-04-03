package util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import model.Conta;
import model.Cliente;

public class TesteLambdas {

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


            lista.sort(
                (co1, co2) -> co1.getTitular().getNome().compareTo( co2.getTitular().getNome())
                );

            Comparator<Conta> comp = (Conta conta1, Conta conta2) ->{
            
                    return Integer.compare(conta1.getNumero(), conta2.getNumero());
            };

            lista.sort(comp);

            lista.forEach((conta) -> System.out.println(conta +", "+conta.getTitular().getNome()));

        }

}