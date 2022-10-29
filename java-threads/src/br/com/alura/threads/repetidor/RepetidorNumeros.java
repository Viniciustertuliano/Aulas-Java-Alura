package br.com.alura.threads.repetidor;

public class RepetidorNumeros implements Runnable{

	public RepetidorNumeros() {
	}

	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++ ) {
			Thread threadAtual = Thread.currentThread();

			System.out.println("Id da thread: " + threadAtual.getId() + " - " + i);
		}
		
	}
}
