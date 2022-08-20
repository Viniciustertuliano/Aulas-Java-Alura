package br.com.alura.loja.virtual.repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.alura.loja.virtual.dao.ProdutoDao;
import br.com.alura.loja.virtual.factory.ConnectionFactory;
import br.com.alura.loja.virtual.model.Produto;

public class TestaInsercaoEListagemDeProduto {
	
	public static void main(String[] args) throws SQLException {
		Produto mesa = new Produto("Mesa", "Mesa de quatro cadeiras");
		
		try(Connection connection = new ConnectionFactory().recuperaConexao()){
			ProdutoDao produtoDAO = new ProdutoDao(connection);
			produtoDAO.salvar(mesa);
			List<Produto> listaProdutos = produtoDAO.listar();
			listaProdutos.stream().forEach(lp -> System.out.println(lp));
		}
	}

}
