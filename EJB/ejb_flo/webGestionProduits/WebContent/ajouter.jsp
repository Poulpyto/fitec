<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ajouter produit</title>
</head>
<body>

	<form action="Ajouter">

		<label for="nom">Nom : </label> <input type="text" id="nom" name="nom" /> <br />
		<label for="prix">Prix : </label> <input type="text" id="prix" name="prix"/> <br />
		<label for="quantite">Quantité : </label> <input type="text"
			id="quantite" name="quantite"/> <br />
			<input type="submit" value="Ajouter">


	</form>
<a href="index.jsp">Retour</a>
</body>
</html>