public class MetodoSeleccion {
    public void ordenar(int[] arreglo, boolean ascendente, boolean mostrarPasos) {
        int comparaciones = 0, intercambios = 0;
        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceExtremo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                comparaciones++;
                if ((ascendente && arreglo[j] < arreglo[indiceExtremo]) || (!ascendente && arreglo[j] > arreglo[indiceExtremo])) {
                    indiceExtremo = j;
                }
            }
            if (indiceExtremo != i) {
                int aux = arreglo[i];
                arreglo[i] = arreglo[indiceExtremo];
                arreglo[indiceExtremo] = aux;
                intercambios++;
                if (mostrarPasos) {
                    imprimirArreglo(arreglo);
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