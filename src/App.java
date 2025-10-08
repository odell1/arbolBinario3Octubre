public class App {
    public static void main(String[] args) throws Exception {
        // Primero debemos dilucidar si el árbol va a contener elementos repetidos o no
        // Las claves o los valores principales del árbol deben ser comparables
        // Si el árbol va a ser auto-balanceado o no (completo o no completo)

        //Falta por hacer:
        // - Si es completo o no
        // - Borrar un nodo (con los tres casos)

        int[] valores= {50,30,70,20,40,60,80};
         ArbolBinarioBusqueda abb=new ArbolBinarioBusqueda();
        for(int valor:valores){
            System.out.println("Insertando "+valor);
           
            abb.insertar(valor);
        }

        System.out.println("Recorrido en orden");
        abb.EnOrden(abb.raiz);
        

        System.out.println("Recorrido en PreOrden");
        abb.preOrden(abb.raiz);

        System.out.println("Recorrido en PosOrden");
        abb.posOrden(abb.raiz);


        System.out.println("Valor menor ");
        System.out.println(abb.encontrarMinimo(abb.raiz));
    }
}
