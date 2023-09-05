<%-- 
    Document   : index
    Created on : 5 de set. de 2023, 18:40:23
    Author     : zanat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Calculadora de Financiamento</title>
</head>
<body>
    <h1>Calculadora de Financiamento</h1>
    
    <form action="FinanceServlet" method="post">
        <label for="loanAmount">Valor do Empréstimo:</label>
        <input type="text" id="loanAmount" name="loanAmount" required><br><br>
        
        <label for="loanTerm">Prazo (em meses):</label>
        <input type="text" id="loanTerm" name="loanTerm" required><br><br>
        
        <label for="interestRate">Taxa de Juros (%):</label>
        <input type="text" id="interestRate" name="interestRate" required><br><br>
        
        <label for="monthlyCost">Custo Mensal (Taxa de Operação do Banco):</label>
        <input type="text" id="monthlyCost" name="monthlyCost" required><br><br>
        
        <input type="submit" value="Calcular">
    </form>
    
    <%-- Exibir mensagens de erro, se houver --%>
    <c:if test="${not empty requestScope.error}">
        <p style="color: red;">${requestScope.error}</p>
    </c:if>
</body>
</html>
