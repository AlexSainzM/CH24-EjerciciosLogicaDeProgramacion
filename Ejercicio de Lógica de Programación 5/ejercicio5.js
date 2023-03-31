//Traemos el contenedor que aloja el resultado correcto
const resultDiv = document.getElementById("resultDiv");

//Solicitamos un numero entre 1 y 100 al usuario

let num = parseInt(prompt("Introduce un número del 1 al 100:"));

// Generamos el numero que será nuestro valor secreto
let randonNum = Math.floor(Math.random()*100+1); //Para devolver el Entero generado apartir de Random que genera un valor aleatorio entre 0 y 1
//let randonNum = 2;
let contador = 1; //Llevar el conteo de los intentos

//Validamos el dato
checkNum();
function checkNum(){
    while (isNaN(num) || !(num > 0 && num < 101)){ //Este ciclo valida que el dato sea numerico sea entre 1 y 100
        tryAgain(); //
    }
}

while (num != randonNum) { // Inicia el juego, Si no acierta en el primer intento, introduce un nuevo numero
    num = parseInt(prompt(`No es ${num}. Introduce otro número del 1 al 100:`)); 
    checkNum(); // Valida el nuevo dato
    contador++; 
}

function tryAgain() {
    alert("El dato ingresado no es valido, prueba nuevamente.");
    num = parseInt(prompt("Introduce un número del 1 al 100:"));
}


createDiv(); //Cuando el usuario adivina el valor, se crean los elementos con la felicitacion
function createDiv() {
    const h1 = document.createElement("h1");
    const h3 = `<h3> Tras ${contador} intentos. </h3>`;
    h1.textContent = `Felicidades, adivinaste el número secreto: ${num}`;
    resultDiv.appendChild(h1);
    resultDiv.innerHTML += h3;
}






