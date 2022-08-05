<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard Taglib</title>
</head>
<body>
	Lista empresas <br/>
	
	<ul>
		<c:if test="${not empty empresa}">
			empresa ${empresa } cadastrada com sucesso!!!
		</c:if>
		<c:forEach items="${empresas}" var="empresa">
			<li>
				${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/YYYY"/>
				<a href="/gerenciador/mostraEmpresa?id=${empresa.id}">edita</a>
				<a href="/gerenciador/removeEmpresa?id=${empresa.id}">remove</a>
			</li>
		</c:forEach>
		
	</ul>

</body>
</html>