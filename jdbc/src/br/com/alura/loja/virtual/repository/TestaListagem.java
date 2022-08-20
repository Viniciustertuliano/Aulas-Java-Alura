package br.com.alura.loja.virtual.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.alura.loja.virtual.factory.ConnectionFactory;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {

	        ConnectionFactory cf = new ConnectionFactory();
	        Connection connection = cf.recuperaConexao();

	        PreparedStatement stm = connection.prepareStatement("SELECT ID, NOME, DESCRICAO FROM PRODUTO");
	        stm.execute();

	        ResultSet rst = stm.getResultSet();

	        while (rst.next()){

	            System.out.println(rst.getInt("ID"));
	            System.out.println(rst.getString("NOME"));
	            System.out.println(rst.getString("DESCRICAO"));
	        }

	        connection.close();

	    }
}
