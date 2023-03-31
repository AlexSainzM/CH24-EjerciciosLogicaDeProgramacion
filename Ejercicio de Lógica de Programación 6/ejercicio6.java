package EjerciciosLogicaProgramacion;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		
		//Solicitamos al usuario una palabra o frase
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese una palabra o frase: ");
		String textoUsuario = scanner.nextLine();
		
		//Invertimos el texto
		String textoInvertido = "";
		for (int i = textoUsuario.length() - 1; i >= 0 ; i--) {
			textoInvertido += textoUsuario.charAt(i);
		}
		
		System.out.println("Texto invertido: " + textoInvertido);
		
	}

}
