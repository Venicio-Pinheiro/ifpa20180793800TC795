package Controle;

import java.io.IOException;
import java.util.*;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servletJogo
 */
@WebServlet("/servletJogo")
public class servletJogo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//Receber a quatidade de jogos com getParameter
		int qtdjogo = Integer.parseInt(request.getParameter("qtdJogos"));
		int contador = 0;
		
		//declaração Objeto do tipo lista
		List<Integer> numeros = new ArrayList<Integer>();
		//Adicionar os 60 numeros a lista;
		for (int i = 1; i <= 60; i++) {
			numeros.add(i);
		}
		
		//Definir a quantidade de jogos de
		while(qtdjogo > contador) {
			contador++;
		response.getWriter().append(" [" + contador + "]  - ");
		
		//Desordear os 60 numeros da lista.
		Collections.shuffle(numeros);
		
		//Definir os 6 numeros do jogo
		List<Integer> escolhidos = numeros.subList(0, 6);
		
		//Ordenar os 6 numeros do jogo
		Collections.sort(escolhidos);
		//request.setAttribute("escolhidos", escolhidos);
		//RequestDispatcher rd  = request.getRequestDispatcher("resultadoMS.jsp"); rd.forward(request, response);
		
		//Adicionar o "0" a esquerda quando o numero for menor que 10 e exibir os valores
		for(Integer escolhido: escolhidos) {
			if(escolhido<10) {
				response.getWriter().append("0" + escolhido + " ");
			}else {
				response.getWriter().append( escolhido + " ");
			}
			
		}
		
		//Separar os jogos
		response.getWriter().append("<html><br></html>");
		}
		//Exibir a quantidade jogos
		response.getWriter().append("Total de jogos" + contador);
		
		
		
	}
	

}
