package EjerciciosLogicaProgramacion;

import java.util.HashMap;
import java.util.Scanner;

public class ejercicio10 {
	public static void main(String[] args) {
        // Creamos el diccionario con un objeto HashMap
        HashMap<String, String> diccionario = new HashMap<>();
        
        // Agregamos palabras al diccionario, son las mismas que las del ejercicio 9.
        diccionario.put("avion", "plane");
        diccionario.put("telefono", "phone");
        diccionario.put("piña", "pineapple");
        diccionario.put("cebolla", "onion");
        diccionario.put("coche", "car");
        diccionario.put("bicicleta", "bike");
        diccionario.put("libreta", "notebook");
        diccionario.put("tinta", "ink");
        diccionario.put("luz", "light");
        diccionario.put("oscuridad", "dark");
        diccionario.put("nube", "cloud");
        diccionario.put("calle", "street");
        diccionario.put("planta", "plant");
        diccionario.put("verde", "green");
        diccionario.put("refresco", "soda");
        diccionario.put("amor", "love");
        diccionario.put("carne", "meat");
        diccionario.put("largo", "long");
        diccionario.put("guitarra", "guitar");
        diccionario.put("rosa", "pink");
        
     // Escogemos 5 palabras al azar del diccionario
        String[] palabrasEspañol = diccionario.keySet().toArray(new String[0]); //Guardamos las palabras en español en un array idependiente para poder extraer 5 palabras
        String[] palabrasSeleccionadas = new String[5]; //Array de 5 elementos
        for (int i = 0; i < 5; i++) {
            int indiceAleatorio = (int) (Math.random() * palabrasEspañol.length); //Al multiplicar cualquier valor entre (0 y <1) * 20 obtendremos valores entre 0 y 19, los index de nuestro array.
            palabrasSeleccionadas[i] = palabrasEspañol[indiceAleatorio]; //Guardamos la palabra aleatoria seleccionada
        }
        
        // Pedimos al usuario que traduzca cada una de las palabras seleccionadas
        Scanner scanner = new Scanner(System.in);
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0; 
        for (String palabraEspañol : palabrasSeleccionadas) {
            String palabraIngles = diccionario.get(palabraEspañol); //utilizamos un for each de las palabras sleccionadas
            System.out.print("Traduce \"" + palabraEspañol + "\" al inglés: ");
            String respuesta = scanner.nextLine().toLowerCase(); //minus para no tener conflico al hacer la relacion 
            if (respuesta.equals(palabraIngles)) {
                System.out.println("Bien ahí");
                respuestasCorrectas++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta es \"" + palabraIngles + "\".");
                respuestasIncorrectas++;
            }
        }
        
        // Mostramos los resultados
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);

	}
}
	
