<%-- 
    Document   : menu
    Created on : 07/02/2017, 08:44:20
    Author     : PauloHenrique
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" href="resources/css/tarefas.css" rel="stylesheet" />
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Página inicial da Lista de Tarefas</h2>
        <p>Bem vindo, ${usuarioLogado.login}</p> 
        <a href="listaTarefas">Clique aqui</a> para acessar a 
        lista de tarefas
        <a href="logout">Sair do sistema</a>
    </body>
</html>
