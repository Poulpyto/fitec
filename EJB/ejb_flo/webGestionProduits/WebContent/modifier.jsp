<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Modifier produit</title>
</head>
<body>

	<form action="Modifier">

		<label for="id">Id : </label> <input type="text" id="id" name="id" value="${ !empty product ? product.id : '' }"/> <br />
		<label for="nom">Nom : </label> <input type="text" id="nom" name="nom" value="${ !empty product ? product.nom : ''}"/> <br />
		<label for="prix">Prix : </label> <input type="text" id="prix" name="prix" value="${ !empty product ? product.prix : ''}"/> <br />
		<label for="quantite">Quantité : </label> <input type="text"
			id="quantite" name="quantite" value="${ !empty product ? product.quantite : ''}"/> <br />
			<input type="submit" value="Modifier">


	</form>
<a href="Lister">Retour</a>
</body>
</html>