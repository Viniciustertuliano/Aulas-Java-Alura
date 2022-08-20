package br.com.alura.loja.virtual.repository;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.alura.loja.virtual.factory.ConnectionFactory;


public class TestaConexao {

	public static void main(String[] args) throws SQLException {

        ConnectionFactory cf = new ConnectionFactory();
        try(Connection connection = cf.recuperaConexao()){

		System.out.println("Fechando conexao!!");

        }
    }

}
