package repasoparcial1;

import tadCola.Cola;
import tadLista.ListaSimple;

public class RepasoParcial1 {

    public static void main(String[] args) {
        
        int[] v1 = {2, 4, 7, 9};
        int[] v2 = {1, 6, 7};
        
        int[] vPal = {2, 4, 1, 4, 2};
        
        int[] v3 = unirDosVectores(v1, v2);
        // Espero: {1, 2, 4, 6, 7, 7, 9}
        
        //System.out.println(mostrarv(v3));
        //System.out.println("Tiene repetidos: " + tieneRepetidos(v3));
        //System.out.println("Es palíndromo: " + esPalindromo(vPal));
        
        int[][] mat = {{2, 1, 4},
                       {5, 3, 10},
                       {9, 7, 3}};
        
        //             {16, 11, 16}
        
        //System.out.println("Suma diagonal: " + sumaDiagonalPrincipal(mat));
        //System.out.println("Cant columnas ascendentes: " + cantColsAscendentes(mat));
        //System.out.println("Dos columnas que sumen lo mismo: " + existen2ColsQueSumanLoMismo(mat));
        
        ListaSimple l = new ListaSimple();
        l.agregarInicio(39);
        l.agregarInicio(30);
        l.agregarInicio(23);
        l.agregarInicio(7);
        l.agregarInicio(5);
        l.agregarInicio(4);
        
        l.mostrar();
        Cola c = l.listaACola();
        c.mostrar();
    }
    
    public static String mostrarv(int []v){
        String ret = "";
        
        for (int pos = 0; pos < v.length - 1; pos++) {
            ret += v[pos] + " | ";
        }
        ret += v[v.length - 1];
        
        return ret;
    }
    
    public static int[] unirDosVectores(int[] v1, int[] v2){
        
        int[] ret = new int[v1.length + v2.length];
        int pos = 0;
        
        int posV1 = 0;
        int posV2 = 0;
        
        while(posV1 < v1.length && posV2 < v2.length) {
            if(v1[posV1] > v2[posV2]){
                ret[pos] = v2[posV2];
                posV2++;
            }else if(v1[posV2] < v2[posV1]){
                ret[pos] = v1[posV1];
                posV1++;
            }else {
                ret[pos] = v1[posV1];
                //pos++;
                posV1++;
                //ret[pos] = v2[posV2];
                //posV2++;
            }
            pos++;
        }
        
        while(posV1 < v1.length) {
            ret[pos] = v1[posV1];
            posV1++;
            pos++;
        }
        
        while(posV2 < v2.length) {
            ret[pos] = v2[posV2];
            posV2++;
            pos++;
        }
        
        return ret;
    }
    
    /*
        PRE: el vector puede contener elementos en el rango de 0 a 20
        POS: retorna true si existen elementos repetidos
    */
    public static boolean tieneRepetidos(int[] v){
        boolean[] elementos = new boolean[21];
        
        for (int i = 0; i < v.length; i++) {
            //No estaba
            if(elementos[v[i]] == false){
                elementos[v[i]] = true;
            }else{
                //Ya estaba
                return true;
            }
        }
        
        return false;
    }
    
    public static boolean esPalindromo(int[] v){
        for (int i = 0; i < v.length / 2; i++) {
            if(v[i] != v[v.length - 1 - i]){
                return false;
            }
        }
        return true;
    }
    
    public static int sumaDiagonalPrincipal(int[][] mat){
        int suma = 0;
        
        for (int i = 0; i < mat.length; i++) {
            suma += mat[i][i];
        }
        
        return suma;
    }
    
    public static int cantColsAscendentes(int[][] mat){
        
        int cantColumnas = 0;
        boolean colEsAsc = true;
        
        for (int col = 0; col < mat[0].length; col++) {
            
            colEsAsc = true;
            
            for (int fila = 0; fila < mat.length - 1 && colEsAsc; fila++) {
                if(mat[fila][col] >  mat[fila + 1][col]){
                    colEsAsc = false;
                }
            }
            
            if(colEsAsc){
                cantColumnas++;
            }
        }
        
        return cantColumnas;
    }
    
    public static boolean existen2ColsQueSumanLoMismo(int[][] mat){ //O(max( (m*n), (n^2) ))
        int[] sumaDeColumnas = new int[mat[0].length];
        int suma = 0;
        
        for (int col = 0; col < mat[0].length; col++) { // O(m*n)
            
            suma = 0;
            
            for (int fila = 0; fila < mat.length; fila++) {
                suma += mat[fila][col];
            }
            
            sumaDeColumnas[col] = suma;
        }
        
        for (int i = 0; i < sumaDeColumnas.length; i++) { // O(n^2)
            for (int j = i + 1; j < sumaDeColumnas.length; j++) {
                if(sumaDeColumnas[i] == sumaDeColumnas[j]){
                    return true;
                }
            }
        }
        
        return false;
    }
    
}
