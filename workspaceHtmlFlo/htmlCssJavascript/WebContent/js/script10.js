
document.getElementById("gros_titre").innerHTML += " HTML";
//change laresse google.com en wikipedia
document.querySelector("a").href = "http://wikipedia.org";

//document.querySelector("p").className="para1";

document.querySelector("h1").id="change";//change css du titre

document.querySelector("img").src="img/animaux_048.jpg";//changement de l'image

//creer du txt

var newPara= document.createElement("p");
newPara.id = "nouveau";

var txt = document.createTextNode("texte insérer grace a javascript");

newPara.appendChild(txt);
document.body.appendChild(newPara);

//inserer du texte
var newPara2= document.createElement("p");
//newPara.id = "nouveau";
var txt = document.createTextNode("texte insérer grace avec insertBefore");
newPara2.appendChild(txt);

var para1=document.querySelector(".para");
document.body.insertBefore(newPara2, para1);

//supprimer 1 elmt
var texteSupprime = document.querySelector("h2");
document.body.removeChild(texteSupprime);
//deplacer text
document.querySelector("h3").className="posy";
