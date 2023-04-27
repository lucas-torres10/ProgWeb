<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<h1>Cadastro de novo usuário</h1>
  <form action="CadastroServlet" method="post">
    <h2>Informações pessoais</h2>
    <label for="nome">Nome:</label>
    <input type="text" id="nome" name="nome"><br>
    <label for="email">E-mail:</label>
    <input type="email" id="email" name="email"><br>
    <h2>Informações acadêmicas</h2>
    <label for="curso">Curso:</label>
    <input type="text" id="curso" name="curso"><br>
    <label for="universidade">Universidade:</label>
    <input type="text" id="universidade" name="universidade"><br>
    <h2>Informações profissionais</h2>
    <label for="empresa">Empresa:</label>
    <input type="text" id="empresa" name="empresa"><br>
    <label for="cargo">Cargo:</label>
    <input type="text" id="cargo" name="cargo"><br>
    <br>
    <input type="submit" value="Cadastrar">
  </form>

</body>
</html>