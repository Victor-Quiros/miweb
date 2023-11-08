/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_10_nivel_jedi;
//Se introduce el Scanner
import java.util.Scanner;
/**
 *
 * @author Víctor Quirós Pavón
 */
public class Ejercicio_10_Nivel_Jedi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Con esta línea de abajo podremos hacer que se reciban datos de
        //teclado
        Scanner sc = new Scanner (System.in);
        //Declaración de variables
        int num1;
        int num2;
        int suma;
        int resta;
        int multiplicacion;
        double division;
        
        //Pido al usuario que introduzca 2 números para efectuar sus cuentas
        System.out.println("Escribe 2 números para saber el resultado de "
                + "sus operaciones");
        
        //El usuario introduce los datos de los 2 números que se piden
        num1= sc.nextInt();
        num2= sc.nextInt();
        
        //Aqui escribo resultados y comienzo a realizar las operaciones
        //y que posteriormente se muestren en pantalla
        System.out.println("Resultados:");
        
        suma= num1 + num2;
        System.out.println("Su suma = "+suma);
        resta= num1 - num2;
        System.out.println("Su resta = "+resta);
        multiplicacion= num1 * num2;
        System.out.println("Su multiplicación = "+multiplicacion);
               
        //Para la division añado un "if", si num2 es 0 saldrá un mensaje
        //si no lo es se realizará la operación
        if (num2==0) {
            System.out.println("No se puede dividir por 0");
        }
        else{
            division = num1 / num2;
            System.out.println("Su división = "+division);
        }
    }
}