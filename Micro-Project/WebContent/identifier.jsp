<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%String st = (String) request.getAttribute("Erreur"); %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>identifier</title>
</head>
<body>
<h1>Identifiez-vous</h1>
<form method="post" action="IdServlet">
<label>E-mail</label>
<input type="text" name="email" value="sabir.ahmed@gmail.com" placeholder="enter-amail@email.com"><br>
<label>Mot de pass</label>
<input type="text" name="mdp" value="Ahmed" placeholder="Password"><br>
<input type="submit" value="OK!">
</form>

<h3 style="color:red;"><%if(st!=null) out.print(st); %></h3>


</body>
</html>