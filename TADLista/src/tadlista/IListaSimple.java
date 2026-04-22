package tadlista;

public interface IListaSimple<T> {
    
    /*
    PRE: -
    POS: Retotrna true si la lista tiene 0 elementos, false en caso contrario
    */
    public boolean esVacia();
    
    public void agregarInicio(T n);
    
    public void agregarFinal(T n);
    
    public void borrarInicio();
    
    public void borrarFin();
    
    public void vaciar();
    
    public void mostrar();
    
    public void agregarOrd(T n);
    
    public void borrarElemento(T n);
    
    public int cantElementos();
    
    public boolean pertenece(T n);
    
    /*
    PRE: Indice es un valor entre 0 y cantidad de elementos - 1
    POS: Devuelve el elemento en el índice.
    */
    public T obtenerElemento(int indice);
    
    public void mostrarREC();
}
