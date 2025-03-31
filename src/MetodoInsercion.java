public class MetodoInsercion {
    public void ordenar(int[] arreglo, boolean ascendente, boolean mostrarPasos) {
        int comparaciones = 0, intercambios = 0;
        for (int i = 1; i < arreglo.length; i++) {
            int aux = arreglo[i];
            int j = i - 1;
            while (j >= 0 && ((ascendente && arreglo[j] > aux) || (!ascendente && arreglo[j] < aux))) {
                comparaciones++;
                arreglo[j + 1] = arreglo[j];
                j--;
                intercambios++;
                if (mostrarPasos) {
                    imprimirArreglo(arreglo);
                }
            }
            arreglo[j + 1] = aux;
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