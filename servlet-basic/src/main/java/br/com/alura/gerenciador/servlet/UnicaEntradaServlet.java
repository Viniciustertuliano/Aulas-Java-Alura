package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.acao.AlteraEmpresa;
import br.com.alura.gerenciador.acao.ListaEmpresas;
import br.com.alura.gerenciador.acao.MostraEmpresa;
import br.com.alura.gerenciador.acao.NovaEmpresa;
import br.com.alura.gerenciador.acao.NovaEmpresaForm;
import br.com.alura.gerenciador.acao.RemoveEmpresa;
import br.com.alura.gerenciador.acao.Acao;

@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
        String paramAcao = req.getParameter("acao"); 

        String nomeDaClasse = "br.com.alura.gerenciador.acao." + paramAcao;
		
		String nome;
		try {
			System.out.println(nomeDaClasse);
	        Class classe = Class.forName(nomeDaClasse);//carrega a classe com o nome 
	        Acao acao = (Acao) classe.newInstance(); 
	        nome = acao.executa(req, resp);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException(e);
		}
		
		String[] tipoEEndereco = nome.split(":");
		if (tipoEEndereco[0].equals("forward")) {			
			RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/view/"+tipoEEndereco[1]);
			rd.forward(req, resp);
		}else {
			resp.sendRedirect(tipoEEndereco[1]);
		}
		
		/*
		if(paramAcao.equals("ListaEmpresas")) {
			ListaEmpresas acao = new ListaEmpresas();
			nome = acao.executa(req, resp);
			}
		else if(paramAcao.equals("RemoveEmpresa")) {
			RemoveEmpresas acao = new RemoveEmpresas();
			nome = acao.executa(req, resp);
		}
		else if(paramAcao.equals("MostraEmpresa")) {
			MostraEmpresa acao = new MostraEmpresa();
			nome = acao.executa(req, resp);	
		}
		else if(paramAcao.equals("AlteraEmpresa")){
			AlteraEmpresa acao = new AlteraEmpresa();
			nome = acao.executa(req, resp);
		}
		else if(paramAcao.equals("NovaEmpresa")){
			NovaEmpresa acao = new NovaEmpresa();
			nome = acao.executa(req, resp);
		}
		else if(paramAcao.equals("NovaEmpresaForm")){
			NovaEmpresaForm acao = new NovaEmpresaForm();
			nome = acao.executa(req, resp);
		}*/
	}

}
