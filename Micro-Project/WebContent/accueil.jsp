<%@page import="com.Model.ClientModel" %>
<%@page import="java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Accueil</title>
</head>
<body>

	<h1>Bonjour 
	<% 
		@SuppressWarnings("unchecked")
		List<ClientModel> ct = (List<ClientModel>) request.getAttribute("Client");
		for(ClientModel client :ct){
	%>
	<%=client.getNom()%>
	<%
		}
	%>
	</h1>
	
	<div>
		<a href="catalogue.jsp" >Consulter le catalogue</a><br/>
		<a href="!!!!!!.jsp" >Suivre vos commandes</a><br/>
		<a href="!!!!!!.jsp" >Visualiser votre panier</a><br/>
	</div>
	
</body>
</html>