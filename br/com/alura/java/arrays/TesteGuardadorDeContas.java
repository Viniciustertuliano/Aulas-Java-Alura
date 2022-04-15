package arrays;

import model.Conta;

public class TesteGuardadorDeContas{
    public static void main(String[] args) {
        GuardadorDeContas guardador = new GuardadorDeContas();

        Conta cc = new Conta(12, 22);
        guardador.adiciona(cc);

        Conta cc2 = new Conta(31, 34);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = guardador.getReferencia(0);
        System.out.println(ref.getNumero());

    }
}