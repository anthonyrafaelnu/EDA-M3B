package practico3;

public class Practico3 {

    public static void main(String[] args) {
        int[] array = {6,3,5,1,8,1,2,4};
        
        //            {1,2,5,6,8,7,3,4}
        
        int[] array2 = {6,3,5};
        
        int[] arrayOrdenado = {1,3,4,5,6,8,9,14};
        
        int[] arraySimetrico1 = {1,3,1};
        
        int[] arraySimetrico2 = {1,3, 4, 3,1};
        
        int[] arrayOrdenado1 = {1,3,3};
        int[] arrayOrdenado2 = {2,3,7,8};
        
        // System.out.println(mostrarv(array));
        // System.out.println("Promedio: " + promedio(array2));
        // System.out.println(muestroValoresImpares(array));
        // System.out.println(muestroPosPares(array));
        // System.out.println("Máximo: " + maxVecOrdenado(arrayOrdenado));
        // System.out.println("Es simétrico: " + esSimetrico(arrayOrdenado));
        // System.out.println("posMinVec: " + posMinVec(array, 4, 7));
        // System.out.println("buscarVecOrdenado: " + buscarVecOrdenado(arrayOrdenado, -2));
        //System.out.println(mostrarv(unirVectoresOrdenados(arrayOrdenado1, arrayOrdenado2)));
        
        ordenarvec(array);
        System.out.println(mostrarv(array));
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
    
    /*
        PRE: Recibo una posición inicial y una final, posDesde <= posHasta,
             ambas posiciones son válidas dentro del array.
        POS: Retorna la posición del valor más chico entre posDesde y posHasta.
    */
    public static int posMinVec(int []v,int posDesde, int posHasta){
        
        int ret = posDesde;
        int menor = v[posDesde];
        
        for (int i = posDesde + 1; i <= posHasta; i++) {
            if(v[i] < menor){
                menor = v[i];
                ret = i;
            }
        }
        
        return ret;
    }
    
    public static boolean buscarVecNoOrdenado(int []v, int elemento){
        
        boolean esta = false;
        
        for (int i = 0; i < v.length && !esta; i++) {
            if(v[i] == elemento){
                esta = true;
                // return true;
            }
        }
        
        return esta;
        // return false;
    }
    
    public static boolean buscarVecOrdenado(int []v, int elemento){
        
        // Optimizaciones
        if(v[0] > elemento) return false;
        if(v[v.length - 1] < elemento) return false;
        
        int izquierda = 0;
        int derecha = v.length - 1;
        
        while(izquierda <= derecha){
            
            // {1,3,4,5,6,8,9,14}
            int medio = (izquierda + derecha) / 2;
            
            if(v[medio] == elemento){
                return true;
            } else if(v[medio] < elemento){
                izquierda = medio + 1;
            }else{
                derecha = medio - 1;
            }
        }
        
        return false;
    }
    
    public static int[] unirVectoresOrdenados(int []v1, int []v2){
        
        int largoV1 = v1.length;
        int largoV2 = v2.length;
        
        int[] ret = new int[largoV1 + largoV2];
        int posRet = 0;
        
        int aux1 = 0;
        int aux2 = 0;
        // Mientras ambos tengan datos a recorrer
        while(aux1 < largoV1 && aux2 < largoV2){
            if(v1[aux1] == v2[aux2]){
                ret[posRet] = v1[aux1];
                posRet++;
                ret[posRet] = v2[aux2];
                posRet++;
                
                aux1++;
                aux2++;
            }else if(v1[aux1] < v2[aux2]){
                ret[posRet] = v1[aux1];
                posRet++;
                aux1++;
            } else {
                ret[posRet] = v2[aux2];
                posRet++;
                aux2++;
            }
        }
        
        // Termino de recorrer v1
        while(aux1 < largoV1){
            ret[posRet] = v1[aux1];
            posRet++;
            aux1++;
        }
        
        // Termino de recorrer v2
        while(aux2 < largoV2){
            ret[posRet] = v2[aux2];
            posRet++;
            aux2++;
        }
        
        return ret;
    }

    public static void ordenarvec(int []v){ // O(n^2)
        for (int i = 0; i < v.length; i++) { // O(n)
            int posMinimo = posMinVec(v, i, v.length - 1); // O(n)
            
            //SWAP
            int aux = v[i];
            v[i] = v[posMinimo];
            v[posMinimo] = aux;
        }
    }
}