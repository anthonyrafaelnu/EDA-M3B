package ordenacion;

import java.util.Arrays;

public class Ordenacion {

    public static void main(String[] args) {

        //int lista[] = {34, 1, 4, 12, 68, 2};
        //int lista[] = {90,1,34,66,77};
        int lista[] = {90,34,66,77,1};
        /*
        System.out.println(Arrays.toString(lista));
        System.out.println("Luego de ordenar con bubble V1");
        bubbleSortV2(lista);
        System.out.println(Arrays.toString(lista));
        */
        
        System.out.println(Arrays.toString(lista));
        System.out.println("Luego de ordenar con selection");
        selectionSortV2(lista);
        System.out.println(Arrays.toString(lista));

    }

    public static void bubbleSort(int lista[]) {
        int pasadas = 0;
        int intercambios = 0;

        for (int i = 0; i < lista.length - 1; i++) {   //Maneja la cantidad de pasadas (burbujas que tiro)
            pasadas++;
            for (int j = 0; j < lista.length - 1 - i; j++) {

                if (lista[j] > lista[j + 1]) {
                    int aux = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = aux;
                    intercambios++;
                }
            }
        }
        System.out.println("Pasadas: " + pasadas + " Intercambios: " + intercambios);
    }

    public static void bubbleSortV2(int lista[]) {
        int pasadas = 0;
        int intercambios = 0;
        boolean estaOrdenado = false;

        for (int i = 0; i < lista.length - 1 && !estaOrdenado; i++) {   //Maneja la cantidad de pasadas (burbujas que tiro)
            pasadas++;
            estaOrdenado = true;

            for (int j = 0; j < lista.length - 1 - i; j++) {
                if (lista[j] > lista[j + 1]) {
                    int aux = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = aux;
                    intercambios++;
                    estaOrdenado = false;
                }
            }
        }
        System.out.println("Pasadas: " + pasadas + " Intercambios: " + intercambios);
    }

    public static void selectionSort(int lista[]) {

        int pasadas = 0;
        int intercambios = 0;

        for (int i = 0; i < lista.length - 1; i++) {
            pasadas++;
            int posMin = i;

            for (int j = i + 1; j < lista.length; j++) {
                if (lista[j] < lista[posMin]) {
                    posMin = j;
                }
            }

            int aux = lista[i];
            lista[i] = lista[posMin];
            lista[posMin] = aux;
            intercambios++;
        }
        
         System.out.println("Pasadas: " + pasadas + " Intercambios: " + intercambios);

    }
    
    
    public static void selectionSortV2(int lista[]) {

        int pasadas = 0;
        int intercambios = 0;
        boolean estaOrdenado = false;

        for (int i = 0; i < lista.length - 1 && !estaOrdenado; i++) {
            pasadas++;
            int posMin = i;
            estaOrdenado = true;

            for (int j = i + 1; j < lista.length; j++) {
                if (lista[j] < lista[posMin]) {
                    posMin = j;
                }
                if(lista[j]<lista[j-1]){
                    estaOrdenado = false;
                }
            }

            int aux = lista[i];
            lista[i] = lista[posMin];
            lista[posMin] = aux;
            intercambios++;
        }
        
         System.out.println("Pasadas: " + pasadas + " Intercambios: " + intercambios);

    }
    
    public static void insertSort(int lista[]){
    
        for(int i=1; i<lista.length; i++){
        
            int insert = lista[i];
            int j = i-1;
            
            while(j>=0 && insert < lista[j]){
                lista[j+1] = lista[j];
                j--;
            }
            
            lista[j+1] = insert;

        }
    }
}
