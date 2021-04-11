<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Inscrivez_vous</h1>
	<form action="MainServlet" method="post">
		<label>Nom</label>
		<input type="text" value ="Ahmed" name="nom"><br>
		<label>Prenom</label>
		<input type="text" value ="Abou" name="prenom"><br>
		<label>Adresse</label>
		<input type="text"  value ="Mhamid" name="adresse"><br>
		<label>Telephone</label>
		<input type="text" value ="0628809545" name="tel"><br>
		<input type="text" value ="40000" name="zipcode">
		<input type="text" value ="Marrakech" name="ville"><br>
		<label>E-mail</label>
		<input type="text" value ="sabir.ahmed@gmail.com" name="email"><br>
		<label>Mot de passe</label>
		<input type="password" value ="Ahmed" name="mdp_insc"><br>
		<input type="submit"  value="Ok"><br>
	</form>
	
</body>
</html>