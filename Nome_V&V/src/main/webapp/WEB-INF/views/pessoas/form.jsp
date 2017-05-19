<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Realize sua pesquisa:</title>
</head>
<body>
<form action="/pessoas" method = "POST">
	<h1>Digite o nome do filme ou artista(s) que deseja pesquisar entre nossas atrações?</h1>
	<div>
		<form> 
			<label>NomePessoa</label>
		 <input type = "text" name = "NomePessoa">
		</form>
	</div>
	<div>
		<label>TipoPessoa</label>
		<input type= "text" name = "TipoPessoa">
		</form>
		<button type= "submmit">cadastrar</button>
	</div>

</body>
</html>