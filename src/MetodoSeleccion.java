public class MetodoSeleccion {
    public void ordenar(int[] arreglo, boolean isDes) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceExtremo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (isDes) { 
                    if (arreglo[j] > arreglo[indiceExtremo]) {
                        indiceExtremo = j;
                    }
                } else { 
                    if (arreglo[j] < arreglo[indiceExtremo]) {
                        indiceExtremo = j;
                    }
                }
            }
            int aux = arreglo[i];
            arreglo[i] = arreglo[indiceExtremo];
            arreglo[indiceExtremo] = aux;
        }
    }

    public void ordenarAscendente(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMin = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMin]) {
                    indiceMin = j;
                }
            }
            int aux = arreglo[i];
            arreglo[i] = arreglo[indiceMin];
            arreglo[indiceMin] = aux;
        }
    }

    public void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " - ");
        }
       System.out.println("    ");
    }
}
