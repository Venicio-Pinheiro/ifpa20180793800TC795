<%@page import="Controle.Usuario"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pagina 02</title>
</head>
<body>
	<h1>Página 2</h1>
	<p>
		Você está na PAG-2, 
		<strong> <%	Usuario user = (Usuario) session.getAttribute("USUARIO"); out.print(user.getNome()); %>
		</strong>
	</p>

	<p>Você deseja ir para onde?</p><br><br>
	<a href="pag-01.jsp">Página 1</a><br><br>
	<a href="index.jsp">Voltar Index</a>

</body>
</html>