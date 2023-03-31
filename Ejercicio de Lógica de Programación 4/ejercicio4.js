//Traemos el div donde vamos a mostrar el resultado
const resultDiv = document.getElementById("resultDiv");

//Solicitamos que el usuario ingrese un numero por promt 
let num = parseInt(prompt("Introduce el tamaño de la serie Fibonacci que quieres conocer: "));

//Varificamos que sea un dato valido 
while (isNaN(num)) {
    alert("Los datos ingresados no son validos, por favor, ingresa un número entero.");
    num = parseInt(prompt("Introduce el tamaño de la serie Fibonacci que quieres conocer: "));
}

// funcion para generar la serie
function fibonacci(num) {
    if (num === 0) {
        return [];
    } else if ((num === 1)) {
        return [0];
    } else if ((num === 2)) {
        return [0, 1];
    } else {
        const serie = [0, 1]; //Esta es el array que va a guardar nuestra serie
        for (let i = 2; i < num; i++){ //Comienza en dos por los indices del array, pero inicia trabajando sobre la posicion 3.
            serie.push(serie[i - 1] + serie[i - 2]);
        }
    return serie;
    }
}

//const serieResultado = fibonacci(num);

result(); //Funcion que crea un h1 con el resultado y lo inserta mediante manipualcion del DOM
 
function result() {
    const h1 = document.createElement("h1");
    const h1layer = `<h1> La serie Fibonacci de ${num} es:`;
    h1.textContent = `${fibonacci(num)}`;
    resultDiv.innerHTML += h1layer;
    resultDiv.appendChild(h1); //resultDiv requiere getElement
}


