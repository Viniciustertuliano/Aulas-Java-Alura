<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    <c:url value="/entrada" var="linkEntradaServlet"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:import url="logout-parcial.jsp"/>	

	<form action="${linkEntradaServlet }" method="post">
		Nome: <input type="text" name="nome"/>
		Data Abertura: <input type="text" name="date" value=""/>
		
		<input type="hidden" name="acao" value="NovaEmpresa">
		
		<input type="submit"/>
	</form>
</body>
</html>