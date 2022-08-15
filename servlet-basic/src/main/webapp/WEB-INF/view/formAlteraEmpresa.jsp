<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    <c:url value="/entrada?acao=AlteraEmpresa" var="linkServletAlteraEmpresa"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:import url="logout-parcial.jsp"/>

	<form action="${linkServletAlteraEmpresa }" method="post">
		Nome: <input type="text" name="nome" value="${empresa.nome }"/>
		Data Abertura: <input type="text" name="date" value="<fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/YYYY"/>"/>
		<input type="hidden" name="id" value="${empresa.id }"/>
		<input type="submit"/>
	</form>
</body>
</html>