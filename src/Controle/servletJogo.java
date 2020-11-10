package Controle;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servletJogo")
public class servletJogo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
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
		out.print("<html><body><h1><table = border=\"1\">");
		out.print("Jogo - [ "+ contador + " ] - ");
		
		
		//Desordear os 60 numeros da lista.
		Collections.shuffle(numeros);
		
		//Definir os 6 numeros do jogo
		List<Integer> escolhidos = numeros.subList(0, 6);
		
		//Ordenar os 6 numeros do jogo
		Collections.sort(escolhidos);
		
		//Adicionar o "0" a esquerda quando o numero for menor que 10 e exibir os valores
		for(Integer escolhido: escolhidos) {
			if(escolhido<10) {
				out.print("0" + escolhido + "  ");
			}else {
				out.print(escolhido + "  ");
			}
		}
		out.print("</table></h1></body></html>");
		//Separar os jogos
		out.print("<h1>" + "<br>"+ "<h1>");
		
		
		}
		//Exibir a quantidade jogos
		out.println( "Total de " + contador + " jogos");
		
		out.println("<html> <bode><br> <a href=\"index.jsp\">Voltar para index</a> </bode> </html>");
	}
	

}
