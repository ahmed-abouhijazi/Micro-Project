<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Detail</title>
</head>
<body>
    <sql:setDataSource
        var="myDs"
        driver="com.mysql.cj.jdbc.Driver"
        url="jdbc:mysql://127.0.0.1:3306/internau"
        user="root" password="fatima1112"
    />
     
    <sql:query var="ArticleDetail"   dataSource="${myDs}">
        SELECT * FROM article WHERE Reference="${param.reference1}";
    </sql:query>
     
     <h1><label>Détail de l'article</label></h1>
     <div>
     <c:forEach var="article" items="${ArticleDetail.rows}">
        <img src="<c:out value="${article.Photo}"/>"><br/>
     	<h3>Reference : <c:out value="${article.Reference}" /></h3>
     	<label>Titre : </label>
     	<c:out value="${article.Titre}" /><br/>
     	<label>Auteur : </label>
		<c:out value="${article.Auteur}" />
		<label>Prix : </label>
        <c:out value="${article.Prix}" /><br/>
        <label>Quantié : </label>
        <c:out value="${article.Quantité}" />
     </c:forEach>
	</div>
	<a href="catalogue.jsp">Retour</a>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="#">Ajouter au panier</a>
</body>
</html>