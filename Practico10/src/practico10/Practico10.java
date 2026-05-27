package practico10;

public class Practico10 {

    public static void main(String[] args) {
        //System.out.println("2^4: " + pot(2, 4)); // 16
        //System.out.println("Factorial 4: " + factorial(4)); // 4 * 3 * 2 * 1 = 24
        
        //System.out.print("Desc de 5 hasta 1: ");
        //mostrarDesc(5); // 5 4 3 2 1
        //System.out.println("");
        
        //System.out.print("Asc de 1 hasta 5: ");
        //mostrarAsc(5); // 1 2 3 4 5
        //System.out.println("");

        //System.out.println("Fib(6): " + fib2(6)); // 0 1 1 2 3 5 8
                                                 // [0, 1, 2, , , ?]
                                                 //              n (pos max) = 6

        // int[] v = {1, 4, 2, 4};
        int[] v = {1, 2, 5, 7};
        //System.out.println("Suma del vector: " + sumarVector(v)); // 11
        //System.out.println("Máximo valor de vec: " + maximoValorDeVec(v)); // 4
        System.out.println("Pertenece 2 a vec: " + pertenece(v, -7)); // true
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
    
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }else{
            return n * factorial(n - 1);
        }
    }
    
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }else{
            return fib(n-1) + fib(n-2);
        }
    }
    
    public static int fib2(int n){
        if(n == 0 || n == 1) return n;
        
        int[] v = new int[n];
        v[0] = 0;
        v[1] = 1;
        return fib2Aux(n, v, 2);
    }
    
    public static int fib2Aux(int n, int[] vec, int posV){
        if(posV == n){
            return vec[posV - 1] + vec[posV - 2];
        }else{
            vec[posV] = vec[posV - 1] + vec[posV - 2];
            return fib2Aux(n, vec, posV + 1);
        }
    }

    //Implementar un algoritmo recursivo que permita 
    // sumar los elementos de un vector.
    public static int sumarVector(int[] v){
        return sumarVectorAux(v, 0);
    }

    public static int sumarVectorAux(int[] v, int posV){
        if(v.length-1 == posV){
            return v[posV];
        }else{
            return v[posV] + sumarVectorAux(v, posV + 1);
        }
    }

    public static int maximoValorDeVec(int[] v){
        //if(v.length == 1) return v[0];
        //return maximoValorDeVecAux(v, 1, v[0]);
        return maximoValorDeVecAuxV2(v, 0);
    }

    public static int maximoValorDeVecAux(int[] v, int posV, int max){
        if(v.length == posV) {
            return max;
        }else{
            if(v[posV] > max){
                max = v[posV];
            }
            return maximoValorDeVecAux(v, posV + 1, max);
        }
    }

    public static int maximoValorDeVecAuxV2(int[] v, int posV){
        if(v.length - 1 == posV) {
            return v[posV];
        }else{
            int max = v[posV];
            int maximoDelRestoDelVector = maximoValorDeVecAuxV2(v, posV + 1);

            if(maximoDelRestoDelVector > max) return maximoDelRestoDelVector;
            return max;
        }
    }

    public static boolean pertenece(int[] v, int n){
        //return perteneceAux(v, 0, n);
        return perteneceBinario(v, n, 0, v.length - 1);
    }

    public static boolean perteneceAux(int[] v, int posV, int n){
        if(posV == v.length - 1){
            return n == v[posV];
        }else{
            return (v[posV] == n) || perteneceAux(v, posV + 1, n);
        }
    }

    public static boolean perteneceBinario(int[] v, int n, int inicio, int fin){
        if(inicio > fin){
            return false;
        }

        int medio = (inicio + fin) / 2;

        if(v[medio] == n){
            return true;
        }

        if(n > v[medio]){
            return perteneceBinario(v, n, medio + 1, fin);
        }else{
            return perteneceBinario(v, n, inicio, medio - 1);
        }
    }
}
