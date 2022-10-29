
package br.com.alura.threads.calcula;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class AcaoBotao implements ActionListener {

	private JTextField primeiro;
	private JTextField segundo;
	private JLabel resultado;

	public AcaoBotao(JTextField primeiro, JTextField segundo, JLabel resultado) {
		this.primeiro = primeiro;
		this.segundo = segundo;
		this.resultado = resultado;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Runnable tarefa = (Runnable) new TarefaMultiplicaacao(primeiro, segundo, resultado);
		Thread threadMultiplicador = new Thread(tarefa, "thread calc");
		threadMultiplicador.start();
	}



}