function calculoedad(){
	
	var fecha = document.getElementById("fechaNacimiento").value;
	var fechanacimiento = new Date(fecha);
	var hoy = new Date();
	var edad = hoy.getTime() - fechanacimiento.getTime();
	edad = Math.floor(edad / (1000 * 60 * 60 * 24 * 365.25));
	document.getElementById("edad").value = edad;
	
};

function seleccion(){
	
	var carreraAspira = document.getElementById("carreraAspira").selectedIndex;
	
	if(carreraAspira == 1 || carreraAspira == 4 || carreraAspira == 5 ){
		costo = 8958000;
	}
	else if(carreraAspira == 2 || carreraAspira == 3){
		costo = 7137000;
	}
	else if(carreraAspira == 6){
		costo = 8336000;
	}
	else if(carreraAspira == 7){
		costo = 7215000;
	}
	else if(carreraAspira == 8){
		costo = 7215000;
	}
	else if(carreraAspira == 9){
		costo = 3796000;
	}
	else if(carreraAspira == 10){
		costo = 3810000;
	}
	else if(carreraAspira == 11){
		costo = 8469000;
	}
	else if(carreraAspira == 12){
		costo = 4418000;
	}
	else if(carreraAspira == 13){
		costo = 3918000;
	}
	else if(carreraAspira == 14){
		costo = 8319000;
	}
	else if(carreraAspira == 15){
		costo = 7494000;
	}
	else if(carreraAspira == 16){
		costo = 6954000;
	}
	else if(carreraAspira == 17 || carreraAspira == 19 ){
		costo = 6605000;
	}
	else if(carreraAspira == 18){
		costo = 7300000;
	}
	else if(carreraAspira == 20){
		costo = 8763000;
	}
	else if(carreraAspira == 21){
		costo = 5228000;
	}
	else if(carreraAspira == 22){
		costo = 5961000;
	}
	else if(carreraAspira == 23){
		costo = 1637778;
	}
	else if(carreraAspira == 24 || carreraAspira == 25 || carreraAspira == 26 || carreraAspira == 27 || carreraAspira == 28){
		costo = 1905556;
	}
	else if(carreraAspira == 29){
		costo = 7448000;
	}
	else if(carreraAspira == 30){
		costo = 7759000;
	}
	else if(carreraAspira == 31){
		costo = 6627000;
	}
	else if(carreraAspira == 32){
		costo = 27195000;
	}
	else if(carreraAspira == 33){
		costo = 11788000;
	}
	else if(carreraAspira == 34){
		costo = 7881000;
	}
	else if(carreraAspira == 35){
		costo = 7903000;
	}
	else{
		costo = 0;
	}
	document.getElementById("precioCarrera").value = costo; 
};

var loadFile = function(event) {
    var reader = new FileReader();
    reader.onload = function(){
      var output = document.getElementById('output');
      output.src = reader.result;
    };
    reader.readAsDataURL(event.target.files[0]);
  };
  function foto() {
	 
	  var rutaImg = document.getElementById("rutaImg").value;
	 document.getElementById("img").src = rutaImg; 
	 
 }

var select = document.getElementById("listadoRegistro");


