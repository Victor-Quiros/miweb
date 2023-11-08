/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_10_bucles_nivel_maestrojedi;
import java.util.Scanner;
/**
 *
 * @author Víctor Quirós Pavón
 */
public class Ejercicio_10_bucles_Nivel_MaestroJedi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num;
        boolean esDiez;
        
        esDiez = false;
        
        System.out.println("Escribe una secuencia de notas");
        do {
            num = sc.nextInt();
            if (num == 10) {
                esDiez = true;
            }
        } while (num != -1 );
        
        if (esDiez == true) {
            System.out.println("Se escribió algún 10");
        }
        else {
            System.out.println("No se escribió ningún 10");
        }
    }
    
}
