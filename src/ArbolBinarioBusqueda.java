public class ArbolBinarioBusqueda {
        Nodo raiz;


        public ArbolBinarioBusqueda(Nodo raiz) {
            this.raiz = raiz;
        }

        public ArbolBinarioBusqueda() {
            this.raiz = null;
        }

        //Insercción de un nodo de manera recursivo. 
        public void insertar(int valor){
            raiz =insertarRecursivo(raiz, valor);
        }//insertar
        

        public Nodo insertarRecursivo(Nodo nodo,int valor){
            if(nodo==null) {
               // nodo.setValor(valor);nodo.setDerecha(null);nodo.setIzquierda(null);return nodo;
                return new Nodo(valor);
            }


            if(valor<nodo.getValor()){
                nodo.setIzquierda(insertarRecursivo(nodo.getIzquierda(), valor));
            }else{
                nodo.setDerecha(insertarRecursivo(nodo.getDerecha(), valor));
            }//if


            return nodo;

        }//insertarRecursivo

        //Recorrido EnOrden (InOrden) Izquierda, raiz, Derecha
        public void EnOrden(Nodo nodo){
            if(nodo!=null){
                EnOrden(nodo.izquierda);
                System.out.println("Valor "+nodo.getValor()+" ");
                EnOrden(nodo.getDerecha());
            }//if

        }//EnOrden

        //Recorrido preOrden raiz, izquierda, derecha
        public void preOrden(Nodo nodo){
            if(nodo!=null){
                System.out.print("Valor "+nodo.getValor()+" ");
                preOrden(nodo.izquierda);
                preOrden(nodo.getDerecha());
            }//if

        }//EnOrden


       //Recorrido posOrden  izquierda, derecha, raiz
        public void posOrden(Nodo nodo){
            if(nodo!=null){
                posOrden(nodo.izquierda);
                posOrden(nodo.getDerecha());
                System.out.print("Valor "+nodo.getValor()+" ");
            }//if

        }//EnOrden

////////////////
/// Búsqueda ojete! debe ser recursivo
/// Debemos pensar en recursividad!!!!
/// ////////////////////////
        public boolean buscar(int valor){
            return buscarRecursivo(raiz,valor);
        }

        private boolean buscarRecursivo(Nodo nodo, int valor) {
           //Primero comprobamos si el nodo es null
           if (nodo==null) return false;
            // comprobamos si el nodo es el valor
           if(nodo.getValor()==valor) return true;

           return valor<nodo.getValor() ? buscarRecursivo(nodo.getIzquierda(), valor) : buscarRecursivo(nodo.getDerecha(), valor);
           /* if (valor<nodo.getValor()) buscarRecursivo(nodo.getIzquierda(), valor) else buscarRecursivo(nodo.getDerecha(), valor); */


        }//buscarRecursivo

//////////////////////////
/// Buscar el valor mínimo
//////////////////////////
    public int encontrarMinimo(Nodo nodo) {
        return nodo.getIzquierda() == null ? nodo.valor : encontrarMinimo(nodo.getIzquierda());
    }//encontrarMinimo
    


//////////////////////////
/// Altura del árbol
//////////////////////////
// Sin recursividad
public int calcularAltura(Nodo nodo)
{
    int altura=0;
    while(nodo!=null){
        altura++;
        if(nodo.getIzquierda()!=null){
            nodo=nodo.getIzquierda();
        }else{
            nodo=nodo.getDerecha();
        }//if

    }//while
    return altura;
}//calcularAltura

//Con recursividad
public int calcularAlturaRecursiva(Nodo nodo){
    if(nodo==null) return 0;
    else{
        return 1 + Math.max(calcularAlturaRecursiva(nodo.getIzquierda()),calcularAlturaRecursiva(nodo.getDerecha()));
    }//else 

}//calcularAlturaRecursiva




}//ArbolBinarioBusqueda
