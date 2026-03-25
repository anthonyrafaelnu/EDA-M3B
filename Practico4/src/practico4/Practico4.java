package practico4;

public class Practico4 {

    public static void main(String[] args) {
        int[][] mat = {{1, 2},
                       {3, 4},
                       {5, 6},
                       {7, 8},
                       {9, 10}};
        
        int[][] matCuadrada = { {1, 2, 13},
                                {4, 5, 6},
                                {17, 8, 9}};
        
        //mostrarMatriz(mat);
        //mostrarDiagonalV2(matCuadrada);
        //System.out.println("Máximo: " + maximoMatriz(matCuadrada));
        //mostrarColumna(mat, 0);
        //mostrarFila(matCuadrada, 0);
        //mostrarFilasImpares(mat);
        //System.out.println("buscarElementoEnMatriz: " + buscarElementoEnMatriz(matCuadrada, 0));
        System.out.println("buscarEnColumna: " + buscarEnColumna(matCuadrada, 1, 8));
    }
    
     public static void mostrarMatriz(int[][] mat){
         for (int i = 0; i < mat.length; i++) {
             for (int j = 0; j < mat[i].length; j++) {
                 System.out.print(mat[i][j] + " ");
             }
             System.out.println("");
         }
     }
     
    public static void mostrarDiagonalV1(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(i == j){
                    System.out.println(mat[i][j]);
                }
            }
        }
    }
    
    public static void mostrarDiagonalV2(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            System.out.println(mat[i][i]);
        }
    }
    
    public static int maximoMatriz(int[][] mat){
        int max = mat[0][0];
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] > max){
                    max = mat[i][j];
                }
            }
        }
        
        return max;
    }

    public static void mostrarColumna(int[][] mat, int columna){
        for (int i = 0; i < mat.length; i++) {
            System.out.println(mat[i][columna]);
        }
    }

    public static void mostrarFila(int[][] mat, int fila){
        for (int j = 0; j < mat[fila].length; j++) {
            System.out.print(mat[fila][j] + " ");
        }
    }
    
    public static void mostrarFilasImpares(int[][] mat){
        for (int i = 1; i < mat.length; i+=2) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static boolean buscarElementoEnMatriz(int[][] mat, int elemento){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] == elemento){
                    return true;
                }
            }
        }
        
        return false;
    }

    public static boolean buscarEnColumna(int[][] mat, int columna, int elemento){
        for (int i = 0; i < mat.length; i++) {
            if(mat[i][columna] == elemento){
                return true;
            }
        }
        
        return false;
    }
}