package EjerciciosLogicaProgramacion;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		
		//Inicializamos las variables que vamos a utilizar
		String diaSemana = "";
		int hora = 0;
		int minutos = 0;
		boolean dateCheck = false; //Esta variable funciona como semaforo para verificar los datos
		boolean HHmmCheck = false;
		int minutosParaElFinDe = 0;
		
		//Solicitamos al usuario los datos
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Ingrese el día de la semana (Lunes - Viernes): ");
	        diaSemana = scanner.nextLine().toLowerCase();
	        
	        //Verifica que el dia de la semana sea valido
	        if (diaSemana.equals("lunes") || diaSemana.equals("martes") || diaSemana.equals("miércoles") ||
                    diaSemana.equals("jueves") || diaSemana.equals("viernes") || diaSemana.equals("sabado") || diaSemana.equals("domingo")) {
                dateCheck = true;
            } else {
                System.out.println("Día de la semana ingresado inválido. Intente nuevamente.");
                //break;
            }
		} while (!dateCheck);
		
		while (!HHmmCheck) { //Verifica que la hora ingresada sea valida
			System.out.println("Ingrese la hora (0-23): ");
			hora = scanner.nextInt();
			
			System.out.println("Ingrese los minutos (0-59): ");
			minutos = scanner.nextInt();
			
			if (hora >= 0 && hora <= 23 && minutos >= 0 && minutos <= 59) {
                HHmmCheck = true;
            } else {
                System.out.println("Hora ingresada inválida. Intente nuevamente.");
                HHmmCheck = false;
                //break;
            }
        }
		
		//Calculamos los minutos restantes hasta el fin de semana
		if (diaSemana.equals("domingo") || diaSemana.equals("sabado")) {
			System.out.println("Ya es fin de semana :)");
		}
		if (diaSemana.equals("viernes")) {
            if (hora < 17) { //Suponiendo que el fin de comienza los viernes a las 17HH 
                minutosParaElFinDe = (17 - hora) * 60 - minutos;
            } else {
            	System.out.println("Ya es fin de semana :)");
            }
        } else if (diaSemana.equals("lunes")) {
        	minutosParaElFinDe = (((4 * 24) + (17 - hora)) * 60) - minutos;
        } else if (diaSemana.equals("martes")) {
        	minutosParaElFinDe = (((3 * 24) + (17 - hora)) * 60) - minutos;
        } else if (diaSemana.equals("miercoles")) {
        	minutosParaElFinDe = (((2 * 24) + (17 - hora)) * 60) - minutos;
        } else if (diaSemana.equals("jueves")) {
        	minutosParaElFinDe = (((1 * 24) + (17 - hora)) * 60) - minutos;
        }
		System.out.println("Faltan " + minutosParaElFinDe + " minutos para el fin de semana.");
	}
}



