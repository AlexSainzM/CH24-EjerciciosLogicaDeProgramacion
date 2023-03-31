//Traemos el div en donde se agregara el resultado
const result00 = document.getElementById("result");
// Inicializamos las variables que necesitamos
let max = 0;
let min = 0;
let center = 0;

// Solicitamos por promt tres numeros enteros y los guardamos en sus respectivas variables
let num1 = parseInt(prompt("Ingresa el primer número entero:"));
let num2 = parseInt(prompt("Ingresa el segundo número entero:"));
let num3 = parseInt(prompt("Ingresa el tercer número entero:"));

//Verificamos que los numeros sean validos
if (isNaN(num1) || isNaN(num2) || isNaN(num3)) {
    console.error("Los valores ingresados no son números enteros.");
} else {
    //Se ordenan los numeros de mayor a menor
    max = Math.max(num1,num2,num3);
    min = Math.min(num1,num2,num3);
    center = (num1+num2+num3) - (max+min);  
}

result();

function result() {
    const div = document.createElement("div"); //Crea un elemento div
    const h11 = document.createElement("h1");  //En h11 y h12 se mostraran los rusltados
    const h12 = document.createElement("h1");
    if (num1 === num2 && num2 === num3) {
        h11.textContent = "Los números ingresados son iguales";
        h12.textContent = "";
    } else {
        h11.textContent = `Ordenados de mayor a menor: ${max}, ${center}, ${min}`;
        h12.textContent = `Ordenados de menor a mayor: ${min}, ${center}, ${max}`;
    }
    div.appendChild(h11);
    div.appendChild(h12);
    result00.appendChild(div);
}

