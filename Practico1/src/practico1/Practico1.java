package practico1;

public class Practico1 {

    public static void main(String[] args) {
        //dosNumeros(2,5);
        //dosNumeros(5,2);
        //dosNumeros(2,2);
//        imprimirPrimerosNImpares(5);
        //imprimirPrimerosNImpares2(5);
        imprimirDigitosDeEnteroPorSeparado(31);
    }
    
    public static int sumaImpares(){
        int suma = 0;
        for (int i = 1; i <= 50; i++) {
            if(i % 2 != 0){
                suma += i;
            }
        }
        return suma;
    }
    
     public static int sumaImpares2(){
        int suma = 0;
        for (int i = 1; i <= 50; i+=2) {
            suma += i;
        }
        return suma;
    }
     
     public static void dosNumeros(int num1, int num2){
         
         double prom = (num1 + (double)num2) / 2;
         
         int minimo = Math.min(num1, num2);
         int maximo = Math.max(num1, num2);
         
         // int inicio = (minimo % 2 == 0) ? minimo : minimo + 1;
         
         int inicio = minimo + 1;
         
         if(inicio % 2 != 0){
             inicio++;
         }
         
         int cantPares = 0;
         for (int i = inicio; i < maximo; i+=2) {
             cantPares++;
         }
         
         System.out.println("Promedio: " + prom);
         System.out.println("Cant. pares: " + cantPares);
     }
     
     public static void imprimirPrimerosNImpares(int n){
         int cont = 1;
         for (int i = 1; cont <= n; i+=2) {
             System.out.print(i + " ");
             cont++;
         }
     }
     
     public static void imprimirPrimerosNImpares2(int n){
         int cont = 1;
         int valorImpar = 1;
         while(cont <= n){
             System.out.print(valorImpar + " ");
             valorImpar+=2;
             cont++;
         }
     }

     public static void imprimirDigitosDeEnteroPorSeparado(int num){
         
         String stringNumero = num + "";
         // String numeroSeparado = "";
         for (int i = 0; i < stringNumero.length(); i++) {
             // int ultimoDigito = num % 10;
             // num = num / 10;
             // numeroSeparado += " " + ultimoDigito;
             System.out.print(stringNumero.charAt(i) + " ");
         }
     }
}