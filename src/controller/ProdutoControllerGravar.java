package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Produto;
import persistence.ProdutoDao;

@WebServlet("/ProdutoControllerGravar")
public class ProdutoControllerGravar extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	@SuppressWarnings("deprecation")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Produto p = new Produto();
			p.setNome(request.getParameter("nome"));
			p.setPreco(new Double(request.getParameter("preco")));
			p.setImagem(request.getParameter("imagem"));
			ProdutoDao pdao = new ProdutoDao();
			pdao.create(p);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("ProdutoController");
	}

}
