/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_6_nivel_padawan;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ejercicio_6_Nivel_Padawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double preartic;
        double preventreal;
        double artdescuento;
        
        
        System.out.println("Escribe el precio de un artículo");
        Scanner sc = new Scanner(System.in);
        preartic = sc.nextDouble();
        
        System.out.println("Escribe el precio de venta real");
        preventreal = sc.nextDouble();
        
        
        artdescuento = preartic - preventreal;
        artdescuento = (artdescuento/preartic)*100;
        
        System.out.println("El porcentaje de descuento realizado es: "+artdescuento +"%");
    }
}
