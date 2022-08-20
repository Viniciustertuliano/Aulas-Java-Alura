package br.com.alura.loja.virtual.repository;

import java.sql.SQLException;

import br.com.alura.loja.virtual.factory.ConnectionFactory;

public class TestaPoolConexoes {
	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		
		for(int i = 0; i < 20; i++) {
			connectionFactory.recuperaConexao();
			System.out.println("Numeros de conexoes:"+i);
		}
		
	}
}
