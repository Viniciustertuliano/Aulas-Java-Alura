package br.com.alura.threads.busca.nome;

public class Principal {

	public static void main(String[] args) {
		String nomeProcurado = "da";
		
		Thread threadAutores = new Thread(new TarefaBuscaNome("autores.txt", nomeProcurado));
	    Thread threadAssinaturas1 = new Thread(new TarefaBuscaNome("assinaturas1.txt", nomeProcurado));
	    Thread threadAssinaturas2 = new Thread(new TarefaBuscaNome("assinaturas2.txt", nomeProcurado));
	    
	    threadAutores.start();
	    threadAssinaturas1.start();
	    threadAssinaturas2.start();
	}

}
