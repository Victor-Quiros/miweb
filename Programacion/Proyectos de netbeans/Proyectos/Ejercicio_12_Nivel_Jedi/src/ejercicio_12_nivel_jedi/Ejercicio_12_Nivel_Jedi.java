/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_12_nivel_jedi;
import java.util.Scanner;
/**
 *
 * @author Víctor Quirós Pavón
 */
public class Ejercicio_12_Nivel_Jedi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //Definición de variables.
        int num1;
        
        System.out.println("Escribe un número para saber si es "
                + "positivo o negativo");
        //Pido al usuario un número.
        num1 = sc.nextInt();
        
        //Según si el número es mayor que 0 o no sale que espositivo o negativo.
        if (num1>=0) {
            System.out.println("El número "+num1 +" es positivo");
        } else {
            System.out.println("El número "+num1 +" es negativo");
        }
    }
}
