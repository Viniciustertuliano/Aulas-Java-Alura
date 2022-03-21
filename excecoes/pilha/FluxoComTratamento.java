package excecoes.pilha;

public class FluxoComTratamento {
    public static void main(String[] args) {
        System.out.println("Init do main");
        try {
            metodo1();
        } catch(ArithmeticException | NullPointerException ex) {
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    public static void metodo1() {
        System.out.println("Init do metodo1");
            metodo2();
        System.out.println("Fim do metodo1");
    }

    public static void metodo2(){
        System.out.println("Init do metodo 2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            Conta c = null;
            c.deposita();
        }
        System.out.println("Fim do metodo2");
    }
}

/*
Nessa aula, aprendemos:

    O que é, para que serve e como funciona a pilha de execução.
    O que é depuração (debug) e para que serve.
    Como utilizar o Eclipse e sua perspectiva de debug.
    Como alternar entre perspectivas do Eclipse.
*/