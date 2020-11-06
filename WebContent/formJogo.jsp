<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="servletJogo">
		<h2>Jogos da Mega Sena</h2>
		<label>Quantos jogos : <input type="text"
			name="qtdJogos" min="1" max="10">
			<button type="submit">Enviar</button>
		</label>
		
	</form><br>
	<a href="index.jsp">Voltar Index</a>

</body>
</html>