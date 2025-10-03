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

        public void EnOrden(Nodo nodo){
            if(nodo!=null){
                EnOrden(nodo.izquierda);
                System.out.println("Valor "+nodo.getValor());
                EnOrden(nodo.getDerecha());
            }//if

        }//EnOrden






}//ArbolBinarioBusqueda
