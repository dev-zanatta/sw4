<%-- 
    Document   : result
    Created on : 5 de set. de 2023, 18:40:33
    Author     : zanat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Detalhes do Financiamento</title>
</head>
<body>
    <h1>Detalhes do Financiamento</h1>
    
    <table border="1">
        <tr>
            <th>Número</th>
            <th>Parcela Fixa</th>
            <th>Valor dos Juros</th>
            <th>Custo Operacional</th>
            <th>Total a Pagar</th>
        </tr>
        <c:forEach items="${prestacoes}" var="prestacao">
            <tr>
                <td>${prestacao.numero}</td>
                <td>${prestacao.parcelaFixa}</td>
                <td>${prestacao.valorJuros}</td>
                <td>${prestacao.custoOperacao}</td>
                <td>${prestacao.valorTotalPrestacao}</td>
            </tr>
        </c:forEach>
    </table>
    
    <form action="ClearSessionServlet" method="post">
        <input type="submit" value="Limpar Dados">
    </form>
</body>
</html>
