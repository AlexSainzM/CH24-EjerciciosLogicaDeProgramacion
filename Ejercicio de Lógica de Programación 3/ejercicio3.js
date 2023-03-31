//Traemos el div donde se agrega el resultado
const result00 = document.getElementById("result");

//inicializamos las variables que necesitaremos
let numFact = 0;

//Solicitamos el número
let num = parseInt(prompt("Ingresa un npumero entero para conocer su factorial"));

//verificamos que el valor ingresado sea un numero, y lo convierte a tipo entero. Y no permite continuar hasta que el valor sea valido.

while (isNaN(num)){
    alert("El valor ingresado es invalido, prueba nuevamente");
    num = parseInt(prompt("Ingresa un npumero entero para conocer su factorial"));
}

function factorial(num) {
    if (num === 0 || num === 1) {
        return 1 
    } else  {
        return num * factorial(num - 1);
    }
}

result();

function result() {
    const resultInDiv = `<h1> El factorial de ${num} es: ${factorial(num)}`;
    result00.innerHTML += resultInDiv;
}


