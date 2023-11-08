/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_15_nivel_jedi;
import java.util.Scanner;
/**
 *
 * @author Víctor Quirós Pavón
 */
public class Ejercicio_15_Nivel_Jedi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //Definición de variables
        int num1;
        int num2;
        int num3;
        
        //Digo al usuario que escriba 3 números.
        System.out.println("Escribe 3 números diferentes para saber cual"
                + "es mayor");
        //Las variables obtienen el valor que les da el usuario.
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
           
        //Comparo los 3 números con "if" para ver cual es mayor, y que me
        //diga cual es
        if (num1>num2) {
            if (num1>num3) {
                System.out.println("El número mayor es "+num1);
            }
            else {
                System.out.println("El número mayor es "+num3);
            }
        } 
        
        else {
            if (num2>num3) {
                System.out.println("El número mayor es "+num2);
            }
            else {
            System.out.println("El número mayor es "+num3);
        }
    }
  }
}
