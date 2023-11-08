/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_4_bucles_nivel_padawan;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ejercicio_4_Bucles_Nivel_Padawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //Declaración de variables.
        int N;
        
        System.out.println("Escribe un número hasta donde "
                + "llegará el contador");
        N=sc.nextInt();
        
        for (int i = 0; i <= N; i++) {
            System.out.println(i);
        }
    }
}
