package tadlista;

public class ListaSimple implements IListaSimple {
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
    public void agregarInicio(int n) {
        Nodo nuevo = new Nodo(n);
        nuevo.setSiguiente(this.lista);
        lista = nuevo;
        
        if(this.esVacia()){
            this.fin = nuevo;
        }
        
        this.cantidad++;
    }

    @Override
    public void agregarFinal(int n) {
        if(this.esVacia()){
            agregarInicio(n);
        }else{
            Nodo nuevo = new Nodo(n);
            nuevo.setSiguiente(null);
            
            this.fin.setSiguiente(nuevo);
            this.fin = nuevo;
            
            this.cantidad++;
        }
    }

    @Override
    public void borrarInicio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrarFin() {
        if(!this.esVacia()){
            
            Nodo aux = this.lista;
            
            if(aux.getSiguiente() == null){ // Tiene solo un nodo
                this.vaciar();
            }else{
                while(aux.getSiguiente().getSiguiente() != null){
                    aux = aux.getSiguiente();
                }
                
                this.fin = aux;
                aux.setSiguiente(null);
                cantidad--;
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
        Nodo aux = this.lista;
        
        while(aux != null){
            System.out.print(aux.getDato() + " ");
            aux = aux.getSiguiente();
        }
        
        System.out.println("");
    }

    @Override
    public void agregarOrd(int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrarElemento(int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int cantElementos() {
        return this.cantidad;
    }

    @Override
    public boolean pertenece(int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int obtenerElemento(int indice) {
        Nodo aux = this.lista;
        int pos = 0;
        
        while(pos != indice){
            pos++;
            aux = aux.getSiguiente();
        }
        
        return aux.getDato();
    }

    @Override
    public void mostrarREC(Nodo l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
