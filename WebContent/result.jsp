<%@page import="Controle.Usuario"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exercício 04</title>
<style>
#numeroRad {
	color: blue;
	font-size: 40px;
}

#textRad {
	color: red;
	font-size: 30px;
}
</style>
</head>
<body>
	<h1>Exercício 04</h1>
	<a id="textRad">Número randômico:   </a>
	<strong id="numeroRad"> <%Usuario user = (Usuario) session.getAttribute("USUARIO"); out.print(user.getNumero());
 %></strong>
	<br>

	<a href="index.jsp">Voltar Index</a>

</body>
</html>