// package -> Carpeta (case sensitive)
/*
 * Tipos primitivos:
 * boolean
 * char -> carácter
 * string -> cadena de carcateres
 * 
 * variables en orden ascedentes de tamaño
 * byte -> 
 * short
 * int
 * long
 * 
 * float -> un decimal
 * double -> decimales muy grandes
 *  
 * 
 */
package codijava.ejtipado;

public class ejemplo {

    public static void main(String[] args) {

        boolean genero = true;
        char letra;
        letra = 'W';
        float b = 7.8f;
        double c = 9.8;
        double suma = b + c;

        System.out.println("Genero es " + genero);
        System.out.println("La letra principal es: " + letra);
        System.out.println("el numero decimal es: " + b);
        System.out.println("otro decimal: " + c);
        System.out.println("una suma es: " + suma);

    }
}
