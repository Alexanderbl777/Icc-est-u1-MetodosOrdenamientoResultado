public class MetodoBurbujaMejorado {
    public int[] ordenarAscendente(int[] arreglo) {
        int tam = arreglo.length;
        int contComparaciones = 0;
        int cambios = 0;

        for (int i = 0; i < tam - 1; i++) {
            for (int j = 0; j < tam - 1 - i; j++) {
                contComparaciones++;
                System.out.println("Comparaciones -> " + contComparaciones + " - " + arreglo[j] + " - " + arreglo[j + 1]);
                if (arreglo[j] > arreglo[j + 1]) {
                    cambios++;
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
        int[] resultado = {contComparaciones, cambios};
        return resultado;
    }

    public void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println("    ");
    }
}