//Traemos el div que vamos a utilizar
const result00 = document.getElementById("result");

//inicializamos las variables que vamos a utilizar
let tempFarh = 0;
let tempKelv = 0;

//Solicitamos por promt la temperatura en grados celcius
let tempCelc = parseInt(prompt("Ingresa la temperatura en grados celcius: "));

//Verificamos que el valor ingresado sea valido
if (isNaN(tempCelc)) {
    alert("Los datos ingresados no son numericos, por favor ingresa solo el número de la temperatura que quieres convertir en grados celcius");
    tempCelc = parseInt(prompt("Ingresa la temperatura en grados celcius: "));
} else {
    tempFarh = tempCelc * 1.8 + 32;
    tempKelv = tempCelc + 273.15;
    result();
}

//Manipulamos el DOM para mostrar el resultado

function result() {
    const div = document.createElement("div");
    const h11 = document.createElement("h1");
    const h12 = document.createElement("h1");
    h11.textContent = `${tempCelc}° Celcius son: ${tempFarh}° Farenheit`;
    h12.textContent = `${tempCelc}° Celcius son: ${tempKelv.toFixed(2)}° Kelvin`; ////Para solo mostrar dos decimales
    div.appendChild(h11);
    div.appendChild(h12);
    result00.appendChild(div);
}