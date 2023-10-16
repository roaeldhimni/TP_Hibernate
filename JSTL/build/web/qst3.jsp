<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>      
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Question 3</title>
</head>
<body>
	<form method="post" action="">
		<fieldset>
			<p>
			<label>Début : </label>
			<input type="number" name="debut" value="2" />
			</p>
			<p>
			<label>Fin : </label>
			<input type="number" name="fin" value="30" />
			</p>
			<p><input type="submit" value="Valider" /></p>
		</fieldset>
	</form>
	<c:set var="d" value="${param.debut}" />
	<c:set var="f" value="${param.fin}" />	
	<c:if test="${d != null && f != null && d < f}">
		<c:forEach var="entry" begin="${d}" end="${f}"> 
			<c:set var="v" value ="${entry}" />	
			<c:set var="etat" value ="${0}" />
			<c:forEach var="item" begin="${2}" end="${v/2}">
				<c:if test="${v % item == 0 && v != item}">
					<c:set var="etat" value ="${1}" />
				</c:if>
				
			</c:forEach> 
			<c:if test="${etat == 0}">
					<c:out value="${v}"/> nombre premier <br />
			</c:if>
			<c:if test="${etat != 0}">
					<c:out value="${v}"/> nombre non premier <br />
			</c:if>
		</c:forEach> 
	</c:if>
</body>
</html>
