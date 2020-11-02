package Controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControlaForm
 */
@WebServlet("/ControlaForm")
public class ControlaForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Recuperar o parâmetro que vem da solicitação
		String nome = request.getParameter("nome");
		//intancia um objeto e salvar o nome em "bean" de sessão
		Usuario usuario = new Usuario(nome);
				
		if(nome  == null || nome.trim().length() == 0) {
			request.getRequestDispatcher("index.jsp?erro=Nome Inexitente").forward(request,response);
		}else {
			request.getSession().setAttribute("USUARIO", usuario);
			request.getRequestDispatcher("bemvindo.jsp?nome="+ nome.toUpperCase()).forward(request, response);
		}
		
	}

}
