package codijava.ej_02;

public class suma {
    public static void main(String[] args) {
        int a = 12;
        int b = 6;
        
        int suma = a + b;
        int multiplicacion = a * b;
        int division = a/b;
        int residuo = a%b;
            if (residuo == 0) {
                System.out.println("la division es: "+ division);
            }
            else {
                System.out.println("No es dvision exacta");
            }
            
        System.out.println("La suma es: " + suma);
        System.out.println("La multiplicacion es: " + multiplicacion);
    
    }  
}
