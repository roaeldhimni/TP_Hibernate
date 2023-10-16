<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Vérification de Nombre Parfait</title>
</head>
<body>
    <h1>Vérification de Nombre Parfait</h1>
    
    <form method="post" action="">
        <label>Entrez un nombre entier : </label>
        <input type="text" name="entier" />
        <input type="submit" value="Vérifier">
    </form>
    
    <c:choose>
        <c:when test="${not empty param.entier}">
            <c:set var="entier" value="${param.entier}" />
            <c:set var="sommeDiviseurs" value="0" />
            <c:forEach var="diviseur" begin="1" end="${entier - 1}">
                <c:if test="${entier % diviseur == 0}">
                    <c:set var="sommeDiviseurs" value="${sommeDiviseurs + diviseur}" />
                </c:if>
            </c:forEach>
            
            <c:choose>
                <c:when test="${sommeDiviseurs == entier}">
                    <p>${entier} est un nombre parfait.</p>
                </c:when>
                <c:otherwise>
                    <p>${entier} n'est pas un nombre parfait.</p>
                </c:otherwise>
            </c:choose>
        </c:when>
    </c:choose>
</body>
</html>
