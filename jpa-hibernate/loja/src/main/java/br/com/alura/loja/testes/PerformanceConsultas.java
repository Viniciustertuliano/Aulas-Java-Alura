package br.com.alura.loja.testes;

import br.com.alura.loja.dao.CategoriaDao;
import br.com.alura.loja.dao.ClienteDao;
import br.com.alura.loja.dao.PedidoDao;
import br.com.alura.loja.dao.ProdutoDao;
import br.com.alura.loja.modelo.*;
import br.com.alura.loja.util.JpaUtil;

import javax.persistence.EntityManager;
import java.math.BigDecimal;

public class PerformanceConsultas {
    public static void main(String[] args) {
        popularBancoDeDados();

        EntityManager em = JpaUtil.getEntityManager();
        PedidoDao pedidoDao = new PedidoDao(em);
        Pedido pedido = pedidoDao.buscarPedidoComCliente(1l);

        System.out.println(pedido.getCliente().getNome());
        System.out.println("----");

        ProdutoDao produtoDao = new ProdutoDao(em);
        produtoDao.buscarPorParametros("PS5",null,null);
        em.close();
    }

    private static void popularBancoDeDados(){
        Categoria celulares = new Categoria("CELULARES");
        Categoria videogames = new Categoria("VIDEOSGAMES");
        Categoria informatica = new Categoria("INFORMATICA");

        Produto celular = new Produto("Iphone 11", "Iphone 11 64GB",new BigDecimal("2800"), celulares);
        Produto videogame = new Produto("PS5", "PlayStation 5", new BigDecimal("4000"), videogames);
        Produto macbook = new Produto("Macbook", "Macbook Pro retina", new BigDecimal("6000"), informatica);

        Cliente cliente = new Cliente("Vinicius", "123456");

        Pedido pedido = new Pedido(cliente);
        pedido.adicionarItem(new ItemPedido(10,pedido, celular));
        pedido.adicionarItem(new ItemPedido(40,pedido, videogame));

        Pedido pedido2 = new Pedido(cliente);
        pedido2.adicionarItem(new ItemPedido(3, pedido2, macbook));

        EntityManager em = JpaUtil.getEntityManager();

        CategoriaDao categoriaDao = new CategoriaDao(em);
        ProdutoDao produtoDao = new ProdutoDao(em);
        ClienteDao clienteDao = new ClienteDao(em);
        PedidoDao pedidoDao = new PedidoDao(em);

        em.getTransaction().begin();

        categoriaDao.cadastrar(celulares);
        categoriaDao.cadastrar(videogames);
        categoriaDao.cadastrar(informatica);

        produtoDao.cadastrar(celular);
        produtoDao.cadastrar(videogame);
        produtoDao.cadastrar(macbook);

        clienteDao.cadastrar(cliente);

        pedidoDao.cadastrar(pedido);
        pedidoDao.cadastrar(pedido2);

        em.getTransaction().commit();
        em.close();
    }
}
