package tadlista;

import dominio.Persona;

public class TADLista {

    public static void main(String[] args) {
        ListaSimple l = new ListaSimple();
        
        l.agregarInicio(1);
        l.agregarInicio(3);
        l.agregarInicio(2);
        l.agregarInicio(5);
        
        l.agregarFinal(7);
        l.borrarFin();
        
        //l.mostrar();
        //System.out.println("Cantidad de elementos: " + l.cantElementos());
        //System.out.println("Elemento en la posición 3: " + l.obtenerElemento(3));
        
        Persona p = new Persona("Rafa", 24);
        
        ListaSimple listaPersona = new ListaSimple();
        listaPersona.agregarInicio(p);
        
        listaPersona.mostrar();
    }
    
}
