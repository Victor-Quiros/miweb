/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_7_nivel_padawan;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ejercicio_7_Nivel_Padawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int milla;
        int metros;        
        
        System.out.println("Escribe la distancia en millas marinas: ");
        milla = sc.nextInt();
        
        metros = milla *1852;
        
        System.out.println("Las millas introducidas son "+metros +" metros");
    }
}
