/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_11_bucles_nivel_maestrojedi;

/**
 *
 * @author Víctor Quirós Pavón
 */
public class Ejercicio_11_bucles_Nivel_MaestroJedi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pares;
        int impares;
        
        pares = 100;
        impares = 101;
        
        for (int i = 99; i <= 200; i++) {
            if (pares % 2 == 0) {
                pares = pares +i;
                System.out.println("Par " +pares);
            }
            else
                 impares = impares + i;
                 System.out.println("Impar " +impares);
            
        }
    }
    
}
