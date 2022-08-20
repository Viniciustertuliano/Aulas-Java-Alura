package br.com.alura.loja.testes;

import br.com.alura.loja.dao.CategoriaDao;
import br.com.alura.loja.dao.ProdutoDao;
import br.com.alura.loja.modelo.Categoria;
import br.com.alura.loja.modelo.Produto;
import br.com.alura.loja.util.JpaUtil;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.List;

public class CadastroDeProduto {

    public static void main(String[] args) {
        cadastrarProdutos();
        Long id = 1L;
        EntityManager em = JpaUtil.getEntityManager();
        ProdutoDao produtoDao = new ProdutoDao(em);

        Produto produto = produtoDao.buscarPorId(1L);
        System.out.println(produto.getNome());
        System.out.println("----");
        List<Produto> todos = produtoDao.buscarTodos();
        todos.forEach(p-> System.out.println(p.getNome()));
        System.out.println("----");
        List<Produto> produtosPorNome = produtoDao.buscarPorNome("Iphone 11");
        produtosPorNome.forEach(p-> System.out.println(p.getNome()));
        System.out.println("----");
        List<Produto> produtosPorNomeCategoria = produtoDao.buscarPorNomeDaCategoria("CELULARES");
        produtosPorNomeCategoria.forEach(pc-> System.out.println(pc.getNome()));
        System.out.println("----");
        List<BigDecimal> PrecosPorNomeProduto = produtoDao.buscarPrecoPorNomeProduto("Iphone 11");
        PrecosPorNomeProduto.forEach(System.out::println);
    }

    private static void cadastrarProdutos(){
        Categoria celulares = new Categoria("CELULARES");
        Produto televisao = new Produto("Iphone 11", "Iphone 11 64GB",new BigDecimal("2800"), celulares);

        EntityManager em = JpaUtil.getEntityManager();

        CategoriaDao categoriaDao = new CategoriaDao(em);
        ProdutoDao produtoDao = new ProdutoDao(em);

        em.getTransaction().begin();

        categoriaDao.cadastrar(celulares);
        produtoDao.cadastrar(televisao);

        em.getTransaction().commit();
        em.close();
    }
}
