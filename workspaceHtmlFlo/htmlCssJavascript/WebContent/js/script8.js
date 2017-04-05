var titre = document.getElementById("gros_titre");
alert(titre);

var tableau = document.getElementsByTagName("p");
alert("notre page contient " +tableau.length+ " paragraphes");

var tab = document.getElementsByClassName("para");
alert("notre page contient " +tab.length+ " elements de clase para");

var lien = document.querySelector("p a");
alert(lien);

var tab2 = document.querySelectorAll(".para");
alert("notre page contient " +tab2.length+ "elements de classe para");