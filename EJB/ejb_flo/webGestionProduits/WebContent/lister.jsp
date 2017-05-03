<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lister</title>
</head>
<body>

	<table>
		<tr>
			<th>ID</th>
			<th>NOM</th>
			<th>PRIX</th>
			<th>QUANTITE</th>
			<th>Supprimer</th>
			<th>Modifier</th>
		</tr>

		<c:forEach items="${ produits }" var="produit">
			<tr>
				<td>${produit.id}</td>
				<td>${produit.nom}</td>
				<td>${produit.prix}</td>
				<td>${produit.quantite}</td>
				<td><a href="Supprimer?id=${produit.id}">Suppr</a></td>
				<td><a href="PeuplerModifier?id=${produit.id}">Modif</a></td>
			</tr>

		</c:forEach>

	</table>
<a href="ajouter.jsp">Ajouter</a>
<a href="index.jsp">Retour</a>
</body>
</html>