<%-- 
    Document   : formulario-login
    Created on : 07/02/2017, 08:32:07
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
        <h2>Página de login de tarefas</h2>
        <form action="efetuaLogin" method="post">
            Login: <input type="text" name="login"/><br/>            
            Senha: <input type="password" name="senha" /> <br />
            <input type="submit" value="Entrar nas tarefas" /> 
        </form>
    </body>
</html>
