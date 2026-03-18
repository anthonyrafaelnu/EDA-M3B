package practico3;

public class Practico3 {

    public static void main(String[] args) {
        int[] array = {6,3,5,1,8,7,2,4};
        
        int[] array2 = {6,3,5};
        
        int[] arrayOrdenado = {1,3,4,5,6,8,9,14};
        
        int[] arraySimetrico1 = {1,3,1};
        
        int[] arraySimetrico2 = {1,3, 4, 3,1};
        
        // System.out.println(mostrarv(array));
        // System.out.println("Promedio: " + promedio(array2));
        // System.out.println(muestroValoresImpares(array));
        // System.out.println(muestroPosPares(array));
        //System.out.println("Máximo: " + maxVecOrdenado(arrayOrdenado));
        System.out.println("Es simétrico: " + esSimetrico(arrayOrdenado));
    }
    
    public static String mostrarv(int []v){
        String ret = "";
        
        for (int pos = 0; pos < v.length - 1; pos++) {
            ret += v[pos] + " - ";
        }
        ret += v[v.length - 1];
        
        return ret;
    }
    
    public static double promedio(int []v){
        int largo = v.length;
        int contador = 0;
        
        for (int i = 0; i < v.length; i++) {
            contador += v[i];
        }
        
        return contador/(double)largo;
    }
    
    public static String muestroValoresImpares(int v[]){
         String ret = "";
         
         for (int i = 0; i < v.length; i++) {
            if(v[i] % 2 != 0){
                ret += v[i] + " ";
            }
        }
         
         return ret;
    }
    
    public static String muestroPosPares(int v[]){
        String ret = "";
         
         for (int i = 0; i < v.length; i+=2) {
            ret += v[i] + " ";
        }
         
        return ret;
    }
    
    public static int maxVecNoOrdenado(int []v){
        int max = v[0];
        
        for (int i = 1; i < v.length; i++) {
            if(v[i] > max){
                max = v[i];
            }
        }
        
        return max;
    }
    
    /*
        PRE: Recibe un array ordenado
        POS: Retorna el valor máximo del array
    */
    public static int maxVecOrdenado(int []v){
        return v[v.length - 1];
    }
    
    public static boolean esSimetrico(int[] v){
        
        boolean esSimetrico = true;
        
        for (int i = 0; i < v.length / 2 && esSimetrico; i++) {
            if(v[i] != v[v.length - 1 - i]){
                //return false;
                esSimetrico = false;
            }
        }
        
        return esSimetrico;
        //return true;
        
        // 0  ---  length - 1 - 0
        // 1  ---  length - 1 - 1
        // 2  ---  length - 1 - 2
        
        // i  ---  length - 1 - i
    }
    
}
