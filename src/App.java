public class App { //Metodos de ordenamiento
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        int[] listado1={10,21,5,8,0,-1};

        int[] listado = new int[10];
        for(int i=0;i<listado.length;i++){
            listado[i]=(int)(Math.random()*10000)+1;
        }

        int[] listado2 = new int[10];
        for(int i=0;i<listado2.length;i++){
            listado2[i]=(int)(Math.random()*10000)+1;
        }

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("\033[36m Metodo Burbuja");
        MetodoBurbuja mB = new MetodoBurbuja();

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Arreglo original");
        mB.imprimirArreglo(listado);
        System.out.println("--------------------------");
        System.out.println("Arreglo desendente");
        mB.ordenar(listado,true);
        mB.imprimirArreglo(listado);
        System.out.println("Arreglo Asendente");
        mB.ordenar(listado, false);
        mB.imprimirArreglo(listado);
        System.out.println("-------------------------------------------------------------------------------");

        System.out.println("\033[35m Metodo Seleccion");
        MetodoSeleccion mS = new MetodoSeleccion();

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Arreglo original");
        mS.imprimirArreglo(listado2);
        System.out.println("--------------------------");
        System.out.println("Arreglo Desendente");
        mS.ordenar(listado2,true);
        mS.imprimirArreglo(listado2);
        System.out.println("Arreglo Asendente");
        mS.ordenar(listado2, false);
        mS.imprimirArreglo(listado2);

        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("\033[32m Metodo insercion");
        MetodoInsercion mI = new MetodoInsercion();
        
        System.out.println("..........................................................");
        System.out.println("Arreglo original");
        mI.imprimirArray(listado1);
        System.out.println("----------------------------------------------------------");
        System.out.println("Arreglo Ordenados");
        mI.ordenarAsedente(listado1, true);
        mI.imprimirArray(listado1);
        System.out.println("-----------------------------------------------------------");
        mI.ordenarAsedente(listado1, false);
        System.out.println("-----------------------------------------------------------");
        System.out.println("-----FIN-----");

    }
}
