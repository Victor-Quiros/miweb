/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_8_nivel_padawan;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ejercicio_8_Nivel_Padawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int edad;
        System.out.println("Escribe tu edad");
        edad = sc.nextInt();
        
        if (edad>=18) {
            System.out.println("Eres mayor de edad");
        }
    }
}