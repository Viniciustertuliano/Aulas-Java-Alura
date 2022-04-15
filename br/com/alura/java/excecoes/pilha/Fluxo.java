package excecoes.pilha;

/**
 * Classe primcipal no treinamento de tratamento de exceções
 * 
 * @author Vinicius Tertuliano
 */

public class Fluxo {
    public static void main(String[] args) {
        System.out.println("Init do main");
        try {
            metodo1();
        } catch(ArithmeticException | NullPointerException | MinhaExcecao ex) {
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    public static void metodo1() throws MinhaExcecao{
        System.out.println("Init do metodo1");
            metodo2();
        System.out.println("Fim do metodo1");
    }

    /**
     * Utilizando excessão propria para tratativa de erro
     * 
     * @throws MinhaExcecao
     */

    public static void metodo2() throws MinhaExcecao{
        System.out.println("Init do metodo 2");
        throw new MinhaExcecao("Deu muito erro");
        //System.out.println("Fim do metodo2");
    }
}

/*
Nessa aula, aprendemos:

    O que é, para que serve e como funciona a pilha de execução.
    O que é depuração (debug) e para que serve.
    Como utilizar o Eclipse e sua perspectiva de debug.
    Como alternar entre perspectivas do Eclipse.
*/