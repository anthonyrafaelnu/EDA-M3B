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
        
        //Persona p = new Persona("Rafa", 24);
        
        //ListaSimple listaPersona = new ListaSimple();
        //listaPersona.agregarInicio(p);
        
        //listaPersona.mostrar();
        
        ListaSimple lOrdenada = new ListaSimple();
        
        lOrdenada.agregarOrd(2);
        lOrdenada.agregarOrd(1);
        lOrdenada.agregarOrd(7);
        lOrdenada.agregarOrd(-2);
        lOrdenada.agregarOrd(7);
        lOrdenada.agregarOrd(8);
        
        lOrdenada.mostrar();
        
        //System.out.println("Máximo elemento: " + lOrdenada.maximo());
        System.out.println("Cantidad de 7s: " + lOrdenada.contar(7));
    }
    
}
