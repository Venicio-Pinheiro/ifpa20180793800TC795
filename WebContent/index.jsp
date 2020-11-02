<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv-"Content-Type" content="text/html; charset=UTF-8">
<title>Pagina Inicial</title>
</head>
<body>
	<h1>Bem vindo</h1>
	
	<%--Exercicio 01 --%>
	<a>Exercicio 01</a>
	<form action="OlaMundo">
		<button>Servlet Ola Mundo</button>
	</form>
	
	<br>
	<a>Exercicio 02</a>
	<form action="ControlaForm">
		<label>Informe seu nome: 
			<input type="text" name="nome">
		</label>
			<button type="submit">Entrar</button>
	</form>
	<%=request.getParameter("erro") %>
	<br><br>
	
	<a>Exercicio 03</a>
	<form action="randomico.jsp">
		<button>Gerar Randômico (ArquivoJSP)</button>
	</form>
	<br><br>
	<a>Exercicio 04</a>
	<form method= "post" action="servletRandomico">
		<button>Gerar Randômico (Servlet)</button>
	</form>
	
	<br><br>
	<a>Exercicio 05</a>
	<form action="">
		<button>Falta Fazer</button>
	</form>
	
	<br><br>
	<a>Exercicio 06</a>
	<form action="">
		<button>Exercicio 06r</button>
		
	</form>
	
	
</body>
</html>