package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class NovaEmpresa implements Acao{

	public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		System.out.println("acao nova empresa");
		
		String nomeEmpresa = req.getParameter("nome");
		String paramDataEmpresa = req.getParameter("date");
		
		Date dataAbertura = null;
		try {
			SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdt.parse(paramDataEmpresa);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		return "redirect:entrada?acao=ListaEmpresas";
	}

}
