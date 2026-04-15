package tadlista;

public class TADLista {

    public static void main(String[] args) {
        ListaSimple l = new ListaSimple();
        
        l.agregarInicio(1);
        l.agregarInicio(3);
        l.agregarInicio(2);
        l.agregarInicio(5);
        
        l.agregarFinal(7);
        l.borrarFin();
        
        l.mostrar();
        System.out.println("Cantidad de elementos: " + l.cantElementos());
        System.out.println("Elemento en la posición 2: " + l.obtenerElemento(3));
    }
    
}
