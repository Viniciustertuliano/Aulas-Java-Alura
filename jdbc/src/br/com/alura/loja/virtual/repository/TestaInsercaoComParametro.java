package br.com.alura.loja.virtual.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.alura.loja.virtual.factory.ConnectionFactory;

public class TestaInsercaoComParametro {

    public static void main(String[] args) throws SQLException {
        ConnectionFactory cf = new ConnectionFactory();
        try (Connection connection = cf.recuperaConexao();) {


            connection.setAutoCommit(false);

            try (PreparedStatement stm = connection.prepareStatement("INSERT INTO PRODUTO(NOME, DESCRICAO) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS);) {


                adicionarVariavel("Monitor", "Monitor 23p", stm);
                adicionarVariavel("Teclado", "Teclado sem fio", stm);

                connection.commit();


            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("ROLLBACK EXECUTADO");
                connection.rollback();
            }

        }


    }


    private static void adicionarVariavel(String nome, String descricao, PreparedStatement stm) throws SQLException {
        stm.setString(1, nome);
        stm.setString(2, descricao);
/*
        if (nome.equals("Teclado")) {
            throw new RuntimeException("Nao foi possivel adicionar o produto");
        }
*/
        stm.execute();

        try (ResultSet rst = stm.getGeneratedKeys();) {
            while (rst.next()) {
                System.out.println(rst.getInt(1));
            }
        }
    }

}
