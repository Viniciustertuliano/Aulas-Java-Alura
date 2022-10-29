package br.com.alura.threads.repetidor;

public class Principal {

	public static void main(String[] args) {
		new Thread(new RepetidorNumeros()).start();
		new Thread(new RepetidorNumeros()).start();

	}
}
