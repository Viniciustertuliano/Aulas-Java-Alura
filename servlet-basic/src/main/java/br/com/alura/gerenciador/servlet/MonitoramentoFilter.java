package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import br.com.alura.gerenciador.acao.Acao;

//@WebFilter("/entrada")
public class MonitoramentoFilter implements Filter{
	
	@Override
	public void init(FilterConfig config) throws ServletException {}
	
	@Override
	public void destroy() {}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("MonitoramentoFilter");
		
		long antes = System.currentTimeMillis();
		
		String acao = req.getParameter("acao");
		
		chain.doFilter(req, resp);
		
		long depois = System.currentTimeMillis();
		System.out.println("tempo de execução da acao: " + acao + " -> " + (depois - antes));
	}

}
