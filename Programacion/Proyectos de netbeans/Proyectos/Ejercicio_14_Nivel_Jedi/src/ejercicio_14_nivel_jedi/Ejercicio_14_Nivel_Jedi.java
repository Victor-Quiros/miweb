/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_14_nivel_jedi;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ejercicio_14_Nivel_Jedi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num1;
        int num2;
        
        System.out.println("Escribe 2 números para saber cual es el mayor");
        
        num1=sc.nextInt();
        num2=sc.nextInt();
        
        
        if (num1>num2) 
            System.out.println("El número mayor es "+num1);
        else if (num1==num2)
            System.out.println("Los números introducidos son el mismo");
        else
            System.out.println("El número mayor es "+num2);
        
    }
}
