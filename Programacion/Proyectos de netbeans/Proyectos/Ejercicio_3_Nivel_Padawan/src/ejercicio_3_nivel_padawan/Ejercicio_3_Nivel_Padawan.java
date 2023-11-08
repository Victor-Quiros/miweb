/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3_nivel_padawan;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ejercicio_3_Nivel_Padawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //Variables
       int lado;
       int area;
       
       
       System.out.println("Escribe un número que será el lado del cuadrado");
       Scanner sc = new Scanner (System.in);
       
       
       lado = sc.nextInt();
       area= lado*lado;
      
        System.out.println("El área del cuadrado es "+area);
    }
    
}
