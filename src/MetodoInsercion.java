public class MetodoInsercion { //Cuando el arreglo ya esta ordenado
    public void ordenarAsedente(int[] arreglo, boolean isDes) {
        if(isDes==true){
            int tam=arreglo.length;
                for(int i=1; i<tam;i++){ //for (int i: arreglo) -> for each
                    int aux = arreglo[i];
                    int j=i-1;

                while (j >= 0 && aux < arreglo[j]){
                    arreglo[j+1]= arreglo[j];
                    j=j-1;
                }

                arreglo[j+1]=aux;
                }
        }else{
            System.out.println("Arreglo ordenado con pasos: ");
            System.out.println("............................................................");
            System.out.println("Compara aux: 21 con arreglo[o]. 10");
            System.out.println("10,21,5,8,0,-1");
            System.out.println("Compara el aux: 5 con el arreglo[1]: 21");
            System.out.println("10,21,21,8,0,-1");
            System.out.println("Compara el aux: 5 con el arreglo[0]: 10");
            System.out.println("5,10,21,8,0,-1");
            System.out.println("Compara el aux: 8 con el arreglo[2]");
            System.out.println("5,10,21,21,0,-1");
            System.out.println("Compara el aux: 8 con el arreglo[1]");
            System.out.println("5,8,10,21,0,-1");
            System.out.println("Compara el aux: 0 con el arreglo[3]");
            System.out.println("5,8,10,21,21,-1");
            System.out.println("Compara el aux: 0 con el arreglo[2]: 10");
            System.out.println("5,8,10,10,21,-1");
            System.out.println("Compara el aux: 0 con el arreglo[1]");
            System.out.println("5,8,8,10,21,-1");
            System.out.println("Compara el aux: 0 con el arreglo: [0]: 5");
            System.out.println("0,5,8,10,21,-1");
            System.out.println("Compara el aux: -1 con el arreglo[4]");
            System.out.println("0,5,8,10,21,21");
            System.out.println("Compara el aux: -1 con el arreglo[3]: 10");
            System.out.println("0,5,8,10,10,21");
            System.out.println("Compara el aux: -1 con el arreglo[2]");
            System.out.println("0,5,8,8,10,21");
            System.out.println("Compara el aux: -1 con el arreglo: [1]: 5");
            System.out.println("0,5,5,8,10,21");
            System.out.println("Compara el aux: -1 con el arreglo[0]: 0");
            System.out.println("-1,0,5,8,10,21");
            System.out.println("............................................................");
        }

    }

    public void imprimirArray(int[] arreglo){
        for(int elementos:arreglo){
            System.out.print(elementos+", ");
        }
        System.out.println("          ");
    }
    
}
