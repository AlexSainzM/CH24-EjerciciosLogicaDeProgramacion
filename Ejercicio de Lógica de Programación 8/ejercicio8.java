public static void main(String[] args) {
        // Declarar el array y variables necesarias
        int[] numeros = new int[10];
        int cantidadPrimos = 0;

        // Pedir al usuario que ingrese los números y almacenarlos en el array
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // Buscar números primos en el array y moverlos al inicio
        for (int i = 0; i < numeros.length; i++) {
            if (esPrimo(numeros[i])) {
                int temp = numeros[cantidadPrimos];
                numeros[cantidadPrimos] = numeros[i];
                numeros[i] = temp;
                cantidadPrimos++;
            }
        }

        // Mostrar por consola el array con los números primos al inicio
        System.out.println("Array con números primos al inicio:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }
    }

    // Función para determinar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}