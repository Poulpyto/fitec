// cibler un element
var p1 = document.querySelector("p");
// ajouter un ecouteur d'évènement
p1.addEventListener("mouseover", fonction1);
p1.addEventListener("mouseout", reset1);
p1.addEventListener("mousedown", fonction2);
p1.addEventListener("mouseup", reset2);
//definir la fonction
function fonction1(){
	this.innerHTML="Cliquez sur moi";
	this.style.backgroundColor= "green";
}

function reset1(){
	this.innerHTML="Passez sur moi";
	this.style.backgroundColor= "";
}

function fonction2(){
	this.innerHTML="Bravo !";
	this.className="styledown";
}

function reset2(){
	this.innerHTML="apres relachement du clic";
	this.className="styleup";
}