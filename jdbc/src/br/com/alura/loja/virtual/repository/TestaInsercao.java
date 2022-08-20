package br.com.alura.loja.virtual.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.alura.loja.virtual.factory.ConnectionFactory;

public class TestaInsercao {

    public static void main(String[] args) throws SQLException {
        ConnectionFactory cf = new ConnectionFactory();
        Connection connection = cf.recuperaConexao();

        Statement stm = connection.createStatement();
        stm.execute("INSERT INTO PRODUTO(NOME, DESCRICAO) VALUES ('Mouse', 'Mouse sem fio')", Statement.RETURN_GENERATED_KEYS);

        ResultSet rst = stm.getGeneratedKeys();
        while (rst.next()){
            System.out.println(rst.getInt(1));
        }
    }
}
