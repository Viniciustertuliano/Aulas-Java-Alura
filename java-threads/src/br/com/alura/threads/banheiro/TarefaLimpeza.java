package br.com.alura.threads.banheiro;

public class TarefaLimpeza implements Runnable {
	private Banheiro banheiro;

    public TarefaLimpeza(Banheiro banheiro) {
        this.banheiro = banheiro;
    }

    public void run() {
        while(true) {
            this.banheiro.limpa();
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
