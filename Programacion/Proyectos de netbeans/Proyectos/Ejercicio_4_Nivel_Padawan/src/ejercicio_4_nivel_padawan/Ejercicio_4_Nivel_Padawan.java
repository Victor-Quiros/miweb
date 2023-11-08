/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_4_nivel_padawan;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ejercicio_4_Nivel_Padawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int num1;
        int num2;
        int suma;
        int resta;
        int multiplicacion;
        double division;
        
        
        System.out.println("Escribe 2 números  para saber el resultado de"
                + "sus operaciones");
        Scanner sc = new Scanner (System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
        
        suma= num1 + num2;
        resta= num1 -num2;
        multiplicacion= num1 * num2;
        division= num1 / num2;
        
        System.out.println("Esta es la suma: "+suma);
        System.out.println("Esta es la resta: "+resta);
        System.out.println("Esta es la multiplicacion: "+multiplicacion);
        System.out.println("Esta es la division: "+division);
    }
    
}
