<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>      
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Question 2</title>
</head>
<body>
	<form method="post" action="">
		
		<label>Entrer un nombre : </label>
		<input type="text" name="nbr" value="" />
		<input type="submit" value="valider" />
		<c:set var="v" value="${param.nbr}" />
		<c:set var="etat" value ="${0}" />
		<c:forEach var="item" begin="${2}" end="${v/2}">
			<c:if test="${v % item == 0 && v != item}">
				<c:set var="etat" value ="${1}" />
			</c:if>
		</c:forEach> 	
		<c:if test="${etat == 0}">
				<c:out value="${v}"/> Nombre premier <br />
		</c:if>
		<c:if test="${etat != 0}">
				<c:out value="${v}"/> Nombre non premier <br />
		</c:if>
	</form>
</body>
</html>
