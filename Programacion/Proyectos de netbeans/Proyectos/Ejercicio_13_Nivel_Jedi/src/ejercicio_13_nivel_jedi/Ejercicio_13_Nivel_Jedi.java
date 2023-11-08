/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_13_nivel_jedi;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ejercicio_13_Nivel_Jedi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int num1;
        int num2;
        
        System.out.println("Escribe 2 números para ver su orden ascendente");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        
        System.out.println("Orden ascendente:");
        
        if (num1>num2) {
            System.out.println(num2);
            System.out.println(num1);
        }
        else{
            System.out.println(num1);
            System.out.println(num2);
        }
    }
    
}
