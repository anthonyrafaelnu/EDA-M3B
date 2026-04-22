package tadpila;

public class TADPila {

    public static void main(String[] args) {
        Pila p = new Pila();
        
        p.apilar(4);
        p.apilar(1);
        p.apilar(5);
        p.apilar(6);
        
        p.mostrar();
    }
    
}