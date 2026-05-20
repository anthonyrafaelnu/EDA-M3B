package tadpila;

public class TADPila {

    //private static final String patron1 = "()";
            
    public static void main(String[] args) {
        
        
        
        //Pila p = new Pila();
        
//        p.apilar(4);
//        p.apilar(1);
//        p.apilar(5);
//        p.apilar(6);
//        
//        p.mostrar();

        String parentesis = "({[]})"; //true
        String parentesis2 = "({(]})"; //false
        String parentesis3 = "({()})[]"; //true
        String parentesis4 = "[{()})"; //false
        String parentesis5 = "({[}])"; //false
        String parentesis6 = "]{[]}["; //false
        
        System.out.println("Es balanceado: " + balanceoParentesis(parentesis3));
    }
    
    public static boolean balanceoParentesis(String exp){
        if(exp.length() % 2 != 0){
            return false;
        }
        
        Pila p = new Pila();
        
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            
            // Si es un paréntesis que abre entonces lo agrego a la pila
            if(c == '(' || c == '[' || c == '{'){
                p.apilar(c);
            }else if(c == ')' || c == ']' || c == '}'){
                if(p.esVacia()){
                    return false;
                }
                
                char elemEnPila = (char)p.top();
                if(!esPareja(elemEnPila, c)){
                    return false;
                }
                p.desapilar();
            }
        }
        
        return p.esVacia();
    }
    
    private static boolean esPareja(char apertura, char cierre){
        return (apertura == '(' && cierre == ')') ||
               (apertura == '{' && cierre == '}') ||
               (apertura == '[' && cierre == ']');
    }
    
}