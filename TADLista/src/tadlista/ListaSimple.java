package tadlista;

public class ListaSimple<T extends Comparable> implements IListaSimple<T> {
    private Nodo lista;
    private Nodo fin;
    private int cantidad;

    public ListaSimple() {
        this.lista = null;
        this.fin = null;
        this.cantidad = 0;
    }

    @Override
    public boolean esVacia() {
         return this.cantidad == 0;
    }

    @Override
    public void agregarInicio(T n) {
        Nodo<T> nuevo = new Nodo(n);
        nuevo.setSiguiente(this.lista);
        lista = nuevo;
        
        if(this.esVacia()){
            this.fin = nuevo;
        }
        
        this.cantidad++;
    }

    @Override
    public void agregarFinal(T n) {
        if(this.esVacia()){
            agregarInicio(n);
        }else{
            Nodo<T> nuevo = new Nodo(n);
            nuevo.setSiguiente(null);
            
            this.fin.setSiguiente(nuevo);
            this.fin = nuevo;
            
            this.cantidad++;
        }
    }

    @Override
    public void borrarInicio() {
        if(!this.esVacia()){
            Nodo<T> aBorrar = this.lista;
            this.lista = this.lista.getSiguiente();
            aBorrar.setSiguiente(null);
            this.cantidad--;
        }
    }

    @Override
    public void borrarFin() {
        if(!this.esVacia()){
            
            Nodo<T> aux = this.lista;
            
            if(aux.getSiguiente() == null){ // Tiene solo un nodo
                this.vaciar();
            }else{
                while(aux.getSiguiente().getSiguiente() != null){
                    aux = aux.getSiguiente();
                }
                
                this.fin = aux;
                aux.setSiguiente(null);
                this.cantidad--;
            }
            
        }
    }

    @Override
    public void vaciar() {
        this.lista = null;
        this.fin = null;
        this.cantidad = 0;
    }

    @Override
    public void mostrar() {
        Nodo<T> aux = this.lista;
        
        while(aux != null){
            System.out.print(aux.getDato() + " ");
            aux = aux.getSiguiente();
        }
        
        System.out.println("");
    }

    @Override
    public void agregarOrd(T n) {
        // Si es el primer elemento o el que quiero insertar es más chico que el primer elemento
        if(this.esVacia() || n.compareTo(this.lista.getDato()) <= 0 ){
            this.agregarInicio(n);
        // Si el elemento que quiero insertar es mayor al último lo pongo al final
        }else if(n.compareTo(this.fin.getDato()) >= 0 ){
            this.agregarFinal(n);
        // Lo debo agregar en medio de la lista
        }else{
            Nodo<T> nuevo = new Nodo(n);
            Nodo<T> aux = this.lista;
            
            while(aux.getSiguiente().getDato().compareTo(n) < 0){
                aux = aux.getSiguiente();
            }
            
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
			
			this.cantidad++;
        }
    }

    @Override
    public void borrarElemento(T n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int cantElementos() {
        return this.cantidad;
    }

    @Override
    public boolean pertenece(T n) {
        if(this.esVacia()) return false;
        
        Nodo aux = this.lista;
        while(aux != null && !aux.getDato().equals(n)){
            aux = aux.getSiguiente();
        }
        
        return aux != null;
    }
    
    @Override
    public T obtenerElemento(int indice) {
        Nodo<T> aux = this.lista;
        int pos = 0;
        
        while(pos != indice){
            pos++;
            aux = aux.getSiguiente();
        }
        
        return aux.getDato();
    }

    @Override
    public void mostrarREC() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    // Funciones del práctico 7

    /*
        Pre: La lista no es vacía.
        Pos: Retorna el máximo elemento de la lista
    */
    @Override
    public T maximo() {
        T max = (T) this.lista.getDato();
        
        Nodo<T> aux = this.lista.getSiguiente();
        
        while(aux != null){
            if(aux.getDato().compareTo(max) > 0){
                max = aux.getDato();
            }
            aux = aux.getSiguiente();
        }
        
        return max;
    }

    /*
        Pre - 
        Pos: Retorna la cantidad de veces que aparece el elemento pasado como 
             parámetro en la lista
    */
    @Override
    public int contar(T elem) {
        int cantidad = 0;
        
        Nodo<T> aux = this.lista;
        while(aux != null)
        {
            if(elem.equals(aux.getDato())){
                cantidad++;
            }
            aux = aux.getSiguiente();
        }
        
        return cantidad;
    }
    
}
