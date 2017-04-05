// fonction normale
function mult(x, y){
	return (x*y);
}
//fonction anonyme
var carre=function(x){
	return (x*x);
}

//alert(mult(5,2));
/*var a = prompt("entrez le premier nombre", "nombre1");
var b = prompt("entre le second nombre", "");
//appel dune fonction normale
alert(mult(a, b));*/
var c = prompt("donner un nombre", "");
//appel d'une fonction anonyme
alert(carre(c));
