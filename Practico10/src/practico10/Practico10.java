package practico10;

public class Practico10 {

    public static void main(String[] args) {
        System.out.println("2^4: " + pot(2, 4)); // 16
        System.out.println("Factorial 4: " + fact(4)); // 4 * 3 * 2 * 1 = 24
        
        System.out.print("Desc de 5 hasta 1: ");
        mostrarDesc(5); // 5 4 3 2 1
        System.out.println("");
        
        System.out.print("Asc de 1 hasta 5: ");
        mostrarAsc(5); // 1 2 3 4 5
        System.out.println("");
    }
    
    /*
    PRE: exp mayor que 1
    */
    public static int pot(int base, int exp){
        if(exp == 1){
            return base;
        } else {
            return base * pot(base, exp - 1);
        }
    }
    
    public static int fact(int n){
        if(n == 1){
            return 1;
        } else {
            return n * fact(n-1);
        }
    }
    
    public static void mostrarDesc(int n){
        if(n == 1){
            System.out.print(1);
        } else {
            System.out.print(n + " ");
            mostrarDesc(n - 1);
        }
    }
    
    public static void mostrarAsc(int n){
        if(n == 1){
            System.out.print(1 + " ");
        } else {
            mostrarAsc(n - 1);
            System.out.print(n + " ");
        }
    }
    
}
