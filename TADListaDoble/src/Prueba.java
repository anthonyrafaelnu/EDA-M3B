public class Prueba {

    public static void main(String[] args) {
        ListaNodos<Integer> lista = new ListaNodos();
        lista.agregarInicio(23);
        lista.agregarInicio(11);
        lista.agregarInicio(9);
        System.out.println("Luego de agregar al inicio 23,11,9");
        lista.mostrar();
        lista.eliminarInicio();
        lista.eliminarInicio();
        System.out.println("Luego de elminar dos veces inicio");
        lista.mostrar();
        lista.agregarFinal(50);
        lista.agregarFinal(3);
        lista.agregarFinal(78);
        System.out.println("Luego de agregar al final 50,3,78");
        lista.mostrar();
        lista.eliminarFinal();
        lista.eliminarFinal();
        System.out.println("Luego de eliminar al final dos veces");
        lista.mostrar();
        

    }
}
