<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<!DOCTYPE html><html>
  <head>
    <meta charset="UTF-8">
    <title>Salvar Informações</title>
  </head>
  <body>
    <h1>Salvar Informações</h1>
    <form action="SalvarInformacoes" method="post">
      <label for="login">Informações de Login:</label>
      <input type="text" name="login" id="login"><br>
      <label for="pessoais">Informações Pessoais:</label>
      <input type="text" name="pessoais" id="pessoais"><br>
      <label for="academicas">Informações Acadêmicas:</label>
      <input type="text" name="academicas" id="academicas"><br>
      <label for="profissionais">Informações Profissionais:</label>
      <input type="text" name="profissionais" id="profissionais"><br>
      <input type="submit" value="Salvar">
    </form>
  </body>
</html>
