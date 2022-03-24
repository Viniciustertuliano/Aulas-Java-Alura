package arrays;

import excecoes.pilha.Conta;

//array[]
public class TesteArrayReferencias {
    public static void main(String[] args) {
        
        Conta[] contas = new Conta[5];// Inicializa com os valores padroes (null)

        Conta conta = new Conta();
        contas[0] = conta;
        System.out.println(contas[0].getNome()); //Acessando objeto apartir de uma referencia
    
    }
}
