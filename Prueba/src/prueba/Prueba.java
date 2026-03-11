package prueba;

public class Prueba {

    public static void main(String[] args) {
        /* aa;
//        Prueba p = new Prueba();
//        
//        int res = p.sumar(1, 2);
//        
//        int res2 = sumarDos(1, 2);
//        
//        System.out.println("Resultado 1 = " + res);
//        System.out.println("Resultado 2 = " + res2); */

        test();
    }
    
    public static int sumarDos(int num1, int num2){
        return num1 + num2;
    }
    
    public int sumar(int num1, int num2){
        return num1 + num2;
    }
    
    public static void test(){
        
        for (int i = 0; i < 4; i++) {
            
        }
        
        int a = 4;
        a += 1;
        int b = a;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}