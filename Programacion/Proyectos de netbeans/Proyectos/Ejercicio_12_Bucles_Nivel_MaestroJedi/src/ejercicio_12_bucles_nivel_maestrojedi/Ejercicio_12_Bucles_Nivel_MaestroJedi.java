/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_12_bucles_nivel_maestrojedi;
import java.util.Scanner;
/**
 *
 * @author Víctor Quirós Pavón
 */
public class Ejercicio_12_Bucles_Nivel_MaestroJedi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int base;
        int expo;
        int resultado;
        
        System.out.println("Escribe un número para la base");
        base = sc.nextInt();
        System.out.println("Escribe un número para el exponente");
        expo = sc.nextInt();
        
        resultado = 1;

        for (int i = 1; i <= expo; i++) {
             resultado = resultado * base;
             System.out.println(resultado);
        }
        
        
        
        
        
        
        
       // while (expo != 0) {
         //   resultado = resultado * base;
            
        // }
            
        // System.out.println(base);
        
       
        
    }
    
}
