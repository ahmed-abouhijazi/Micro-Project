<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP List Articles</title>
</head>
<body>
    <sql:setDataSource
        var="myDS"
        driver="com.mysql.cj.jdbc.Driver"
        url="jdbc:mysql://127.0.0.1:3306/internau"
        user="root" password="fatima1112"
    />
     
    <sql:query var="listArticles"   dataSource="${myDS}">
        SELECT * FROM article;
    </sql:query>
     
    <div align="center">
        <table border="1" cellpadding="5" >
            <caption><h2>List of users</h2></caption>
        <label>Choisissez le genre : </label>
    	<select name="Type">
		<option value="JAZZ">JAZZ</option>
		<option value="Rap">Rap</option>
		<option value="HIPHOP">HIPHOP</option>
		<option value="KPOP">KPOP</option>
		</select>
            <tr>
                <th>reference</th>
				<th>titre</th>
				<th>auteur</th>
				<th>photo</th>
				<th>prix</th>
            </tr>
            <c:forEach var="article" items="${listArticles.rows}">
                <tr>
                    <td><a href="<c:url value="detail.jsp" ><c:param name="reference1" value="${article.Reference}"></c:param></c:url>"><c:out value="${article.Reference}" /></a></td>
                    <td><c:out value="${article.Titre}" /></td>
                    <td><c:out value="${article.Auteur}" /></td>
                    <td><img src="<c:out value="${article.Photo}"/>" heigh=""></td>
                     <td><c:out value="${article.Prix}" /></td>
                    <td><a href="#">Ajouter au panier</a></td>
                </tr>
            </c:forEach>
        </table>
        
    </div>

</body>
</html>
<!--  <--%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<style>
table,td,th{
border:1px solid black;
}
table.name{
margin-left:auto;
margin-right:auto;
}
</style>
<html>
<head>
<meta charset="ISO-8859-1">

<title>WebForm1</title>
</head>
<body>
	<h1>Catalogue</h1>
	<form action="CatalogServlet" method="post">
	<label>Choisissez le genre : </label>
		<select name="Type">
		<option value="JAZZ">JAZZ</option>
		<option value="Rap">Rap</option>
		<option value="HIPHOP">HIPHOP</option>
		<option value="KPOP">KPOP</option>
		</select>
		<input type="submit" value="ok">
	</form>
	<table class="name">
		<tr>
			<th>reference</th>
			<th>titre</th>
			<th>auteur</th>
			<th>photo</th>
			<th>prix</th>
		</tr>
		
	</table>
</body>
</html>-->