package br.com.alura.loja.virtual.model;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
	private Integer id; 
	private String nome;
	private List<Produto> produtos = new ArrayList<Produto>();
	
	
	public Categoria(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}

	public void adicionar(Produto produto) {
		produtos.add(produto);
		
	}
	
	
}
