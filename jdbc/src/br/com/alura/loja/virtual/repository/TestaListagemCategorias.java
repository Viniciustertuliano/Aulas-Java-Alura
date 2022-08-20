package br.com.alura.loja.virtual.repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.alura.loja.virtual.dao.CategoriaDao;
import br.com.alura.loja.virtual.factory.ConnectionFactory;
import br.com.alura.loja.virtual.model.Categoria;
import br.com.alura.loja.virtual.model.Produto;

public class TestaListagemCategorias {

	public static void main(String[] args)throws SQLException {
		try(Connection connection = new ConnectionFactory().recuperaConexao()){
			CategoriaDao categoriaDao = new CategoriaDao(connection);
			//List<Categoria> listaCategorias = categoriaDao.listar();
			//listaCategorias.stream().forEach(ct -> System.out.println(ct.getNome()));
			
			
			
			List<Categoria> listaCategoriasComProdutos = categoriaDao.listarComProdutos();
			listaCategoriasComProdutos.stream().forEach(ct -> {
				System.out.println(ct.getNome());
					for(Produto produto : ct.getProdutos()) {
						System.out.println(ct.getNome() + "-" + produto.getNome());
					}

			});
			
		}

	}

}
