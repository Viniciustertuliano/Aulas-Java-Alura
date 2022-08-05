package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/novaempresa")
public class NovaEmpresaServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
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
		
		resp.sendRedirect("listaEmpresas");
		
		//chamar jsp
		//RequestDispatcher rd = req.getRequestDispatcher("/novaEmpresaCriada.jsp");
		//req.setAttribute("empresa", empresa.getNome());
		//rd.forward(req, resp);
	}
}
