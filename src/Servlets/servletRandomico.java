package Servlets;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controle.Usuario;




/**
 * Servlet implementation class servletRandomico
 */
@WebServlet("/servletRandomico")
public class servletRandomico extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Random random = new Random();
		int numero = random.nextInt(10);
		
		Usuario usuario = new Usuario(numero);
		request.getSession().setAttribute("USUARIO", usuario);
		request.getRequestDispatcher("result.jsp").forward(request, response);
	}

}
