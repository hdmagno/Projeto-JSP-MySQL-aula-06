<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Produtos</title>
</head>
<body>
	<%@ page import="entity.*, java.util.*"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<table border="1">
		<tr>
			<th>IdProduto</th>
			<th>Nome</th>
			<th>Preço</th>
			<th>Imagem</th>
		</tr>
		<c:forEach items="${lista}" var="lista">
			<tr>
				<td>${lista.id}</td>
				<td>${lista.nome}</td>
				<td>${lista.preco}</td>
				<td><img src="${lista.imagem}" width="150px" height="150px" />
			</tr>
		</c:forEach>
	</table>
	<a href="cadastro.jsp">Voltar para inclusão</a>
	<br />
</body>
</html>