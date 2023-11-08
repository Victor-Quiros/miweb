/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_5_bucles_nivel_jedi;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ejercicio_5_Bucles_Nivel_Jedi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int N;
        int i;
        int factorial;
        
        System.out.println("Escribe número para calcular factorial");
        N=sc.nextInt();
        i=N;
        factorial=1;
        while (N>1) {
            factorial=factorial*i;
            i=i-1;
        
            System.out.println("El factorial de "+N +"es "+i);
        }
        
    }
    
}
