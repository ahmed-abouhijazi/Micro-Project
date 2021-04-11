<%@page import="com.Model.ClientModel" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<% ClientModel ct = (ClientModel) request.getAttribute("Client"); %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Accueil</title>
</head>
<body>
	<h1>Bonjour <%= ct.getNom() %></h1>
	<div>
		<a href="catalogue.jsp" >Consulter le catalogue</a><br/>
		<a href="!!!!!!.jsp" >Suivre vos commandes</a><br/>
		<a href="!!!!!!.jsp" >Visualiser votre panier</a><br/>
	</div>
	
</body>
</html>