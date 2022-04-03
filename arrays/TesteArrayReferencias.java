package arrays;

import model.Conta;

//array[]
public class TesteArrayReferencias {
    public static void main(String[] args) {
        
        Conta[] referencias = new Conta[5];// Inicializa com os valores padroes (null)

        Conta conta = new Conta(44, 65);
        referencias[0] = conta;
        System.out.println(referencias[0].getNumero()); //Acessando objeto apartir de uma referencia

        Conta ref = (Conta) referencias[1]; //type cast

        System.out.println(ref);
    
    }
}
