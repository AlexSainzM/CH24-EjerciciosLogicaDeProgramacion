package EjerciciosLogicaProgramacion;

import java.util.HashMap;
import java.util.Scanner;

public class ejercicio9 {
	
	public static void main(String[] args) {
        // Creamos el diccionario con un objeto HashMap
        HashMap<String, String> diccionario = new HashMap<>();
        
        // Agregamos palabras al diccionario
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
        
        // Pedimos al usuario una palabra en español
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra en español: ");
        String palabraEspañol = scanner.nextLine().toLowerCase(); //la convertimos a minusculas para no tener errores con la coincidencia
        
        // Buscamos la traducción en el diccionario
        if (diccionario.containsKey(palabraEspañol)) { 
            String palabraIngles = diccionario.get(palabraEspañol);
            System.out.println("La traducción al inglés es: " + palabraIngles);
        } else {
            System.out.println("No se encontró la traducción en el diccionario.");
        }
    }
}
