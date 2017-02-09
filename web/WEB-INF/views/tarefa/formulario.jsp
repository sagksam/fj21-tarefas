<%-- 
    Document   : formulario
    Created on : 01/02/2017, 10:28:58
    Author     : PauloHenrique
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" href="resources/css/tarefas.css" rel="stylesheet" />
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Adicionar Tarefas</h3>
        <form:errors path="tarefa.descricao"/>
        <form action="adicionaTarefa" method="post">
            Descrição: <br/>
            <textarea name="descricao" rows="5" cols="100"></textarea><br />
            <input type="submit" value="Adicionar">
        </form>
    </body>
</html>
