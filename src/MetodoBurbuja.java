public class MetodoBurbuja {
    public void ordenar(int[] arreglo, boolean ascendente, boolean mostrarPasos) {
        int comparaciones = 0, intercambios = 0;
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                comparaciones++;
                if ((ascendente && arreglo[j] > arreglo[j + 1]) || (!ascendente && arreglo[j] < arreglo[j + 1])) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    intercambios++;
                    if (mostrarPasos) {
                        imprimirArreglo(arreglo);
                    }
                }
            }
        }
        System.out.println("Comparaciones: " + comparaciones + ", Intercambios: " + intercambios);
    }

    public void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " - ");
        }
        System.out.println();
    }
}