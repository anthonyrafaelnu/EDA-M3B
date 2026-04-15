package tadlista;

public interface IListaSimple {
    
    /*
    PRE: -
    POS: Retotrna true si la lista tiene 0 elementos, false en caso contrario
    */
    public boolean esVacia();
    
    public void agregarInicio(int n);
    
    public void agregarFinal(int n);
    
    public void borrarInicio();
    
    public void borrarFin();
    
    public void vaciar();
    
    public void mostrar();
    
    public void agregarOrd(int n);
    
    public void borrarElemento(int n);
    
    public int cantElementos();
    
    public boolean pertenece(int n);
    
    /*
    PRE: Indice es un valor entre 0 y cantidad de elementos - 1
    POS: Devuelve el elemento en el índice.
    */
    public int obtenerElemento(int indice);
    
    public void mostrarREC(Nodo l);
}
