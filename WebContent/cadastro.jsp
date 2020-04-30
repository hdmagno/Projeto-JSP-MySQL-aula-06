<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Produtos</title>
</head>
<body>
	<h2>Cadastrar Produto</h2>
	<hr />
	<form method="post" action="ProdutoControllerGravar">
		<br>Nome<br> <input type="text" name="nome" id="nome"
			value="" required /> <br>Preço<br> <input
			type="number" name="preco" id="preco" value="" required />
		<br>Imagem<br>
		<textarea rows="5" cols="60" name="imagem" id="imagem"></textarea>
		<br><button type="submit">Enviar dados</button>
	</form>
	<br>${msg}
</body>
</html>