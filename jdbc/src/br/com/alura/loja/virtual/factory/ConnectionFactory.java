package br.com.alura.loja.virtual.factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {

    public DataSource dataSources;

    public ConnectionFactory(){

        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC");
        comboPooledDataSource.setUser("root");
        comboPooledDataSource.setPassword("123");
        
        comboPooledDataSource.setMaxPoolSize(15);

        this.dataSources = comboPooledDataSource;
        }

    public Connection recuperaConexao() throws SQLException {
        return this.dataSources.getConnection();
    }
}