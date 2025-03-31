import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {//Metodos de ordenamitno
        int[] arreglo = {10, 9, 21, 5, 15, 2, -1, 0};

        MetodoBurbuja mB = new MetodoBurbuja();
        MetodoSeleccion mS = new MetodoSeleccion();
        MetodoInsercion mI = new MetodoInsercion();
        MetodoBurbujaMejorado mM = new MetodoBurbujaMejorado();

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            
            System.out.println("\033[36m-----------------------------------");
            System.out.println("Método de Ordenamiento");
            System.out.println("1 -> Burbuja");
            System.out.println("2 -> Selección");
            System.out.println("3 -> Inserción");
            System.out.println("4 -> Burbuja Mejorado");
            System.out.println("5 -> Salir");
            System.out.println("----------------------------------");

            int metodo = getPositive(scanner, "Ingrese la opción");

            if (metodo == 5) {
                System.out.println("------------------------------------");
                System.out.println("Adiós");
                break;
            }

            String[] opciones = {"A", "D"};
            String orden = getValidaString(scanner, opciones, "¿Desea ordenar ascendentemente o descendentemente? (A: Ascendente, D: Descendente)");
            boolean ascendente = orden.equalsIgnoreCase("A");

            String[] opcionesPasos = {"True", "False"};
            String verPasosInput = getValidaString(scanner, opcionesPasos, "¿Quiere ver los pasos? (True/False)");
            boolean verPasos = verPasosInput.equalsIgnoreCase("True");

            int[] copiaArreglo = arreglo.clone();

            System.out.println("Arreglo Original: ");
            imprimirArreglo(copiaArreglo); 

            if (verPasos) {
              
                switch (metodo) {
                    case 1:
                        System.out.println("\033[36m Método Burbuja");
                        mB.ordenar(copiaArreglo, ascendente, verPasos); 
                        break;
                    case 2:
                        System.out.println("\033[35m Método Selección");
                        mS.ordenar(copiaArreglo, ascendente, verPasos); 
                        break;
                    case 3:
                        System.out.println("\033[32m Método Inserción");
                        mI.ordenar(copiaArreglo, ascendente, verPasos); 
                        break;
                    case 4:
                        System.out.println("Método Burbuja Mejorado");
                        int[] resultado = mM.ordenarAscendente(copiaArreglo);
                        System.out.println("Comparaciones -> " + resultado[0]);
                        System.out.println("Intercambios -> " + resultado[1]);
                        break;
                    default:
                        System.out.println("Opción inválida");
                        break;
                }
            } else {
             
                switch (metodo) {
                    case 1:
                        mB.ordenar(copiaArreglo, ascendente, verPasos); 
                        break;
                    case 2:
                        mS.ordenar(copiaArreglo, ascendente, verPasos); 
                        break;
                    case 3:
                        mI.ordenar(copiaArreglo, ascendente, verPasos); 
                        break;
                    case 4:
                        mM.ordenarAscendente(copiaArreglo); 
                        break;
                    default:
                        System.out.println("Opción inválida");
                        break;
                }
                System.out.println("Arreglo Ordenado: ");
                imprimirArreglo(copiaArreglo); 
            }
        }
    }
    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    public static int getPositive(Scanner scanner, String message) {
        int input;
        do {
            System.out.println(message + " -> ");
            input = scanner.nextInt();
            if (input <= 0) {
                System.out.println("El número debe ser positivo. Intente nuevamente.");
            }
        } while (input <= 0);
        return input;
    }

    public static String getValidaString(Scanner scanner, String[] posibles, String message) {
        String input;
        boolean valido;
        do {
            System.out.println(message + " ");
            input = scanner.next();
            valido = false;
            for (String posible : posibles) {
                if (input.equalsIgnoreCase(posible)) {
                    valido = true;
                    break;
                }
            }
            if (!valido) {
                System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (!valido);
        return input;
    }
}