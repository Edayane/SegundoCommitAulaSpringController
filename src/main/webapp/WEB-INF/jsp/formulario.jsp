<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- Import da taglib -->
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>

<!DOCTYPE html>
<html lang="pt-br">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Formulário</title>
</head>

<body>
${casa}

	<div class="form">
	<form:form action="${s:mvcUrl('CF#create').build()}" method="POST"
		modelAttribute="pessoa">
	</div>
		
		<div class="form">
		<label>Nome</label>
		<form:input path="nome"/>
		</div>
		
		<div class="form">
		<label>Idade</label>
		<form:input path="idade"/>
		</div>
		
		<div class="form">
		<label>Data de Nascimento</label>
		<form:input path="dataNascimento"/>
		</div>
		
		<div>
		<button type = "submit">CADASTRAR</button>
		</div>
		
		
		</form:form>
</body>
</html>