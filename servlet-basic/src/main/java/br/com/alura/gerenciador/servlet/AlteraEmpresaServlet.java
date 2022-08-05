package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/alteraEmpresa")
public class AlteraEmpresaServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nomeEmpresa = req.getParameter("nome");
		String paramDataEmpresa = req.getParameter("date");
		String paramId = req.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Date dataAbertura = null;
		try {
			SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdt.parse(paramDataEmpresa);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Banco banco = new Banco();
		Empresa empresa = banco.buscaEmpresaPorId(id);
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura);
		
		resp.sendRedirect("listaEmpresas");
	}

}
