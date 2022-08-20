package br.com.alura.loja.virtual.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.alura.loja.virtual.factory.ConnectionFactory;

public class TestaRemocao {

    public static void main(String[] args) throws SQLException {
        ConnectionFactory cf = new ConnectionFactory();
        Connection connection = cf.recuperaConexao();

        PreparedStatement stm = connection.prepareStatement("DELETE FROM PRODUTO WHERE ID > ?");
        stm.setInt(1,2);
        stm.execute();

        Integer linhasModificadas = stm.getUpdateCount();
        System.out.println("Linhas modificadas: "+ linhasModificadas);
    }
}
