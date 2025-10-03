public class App {
    public static void main(String[] args) throws Exception {
        int[] valores= {50,30,70,20,40,60,80};
         ArbolBinarioBusqueda abb=new ArbolBinarioBusqueda();
        for(int valor:valores){
            System.out.println("Insertando "+valor);
           
            abb.insertar(valor);
        }

        System.out.println("Recorrido en orden");
        abb.EnOrden(abb.raiz);
    }
}
