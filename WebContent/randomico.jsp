<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import = "java.util.Random" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exercicio 03</title>
</head>
<body>
	 <!-- scriptlet -->
    <% Random geradorDeNumero = new Random(); %>
    <!-- Expressao -->
    <h1>Exercicio 03</h1>
    <a> Numero Randomico:  <%= geradorDeNumero.nextInt(100) %></a>
    <br/>
    <a href="index.jsp">Voltar Index</a>
</body>
</html>