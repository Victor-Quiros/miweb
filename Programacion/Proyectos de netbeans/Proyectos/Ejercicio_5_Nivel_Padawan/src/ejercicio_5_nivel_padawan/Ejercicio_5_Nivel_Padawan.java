/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_5_nivel_padawan;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ejercicio_5_Nivel_Padawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double longitudRadio;
        double longitudCircunferencia;
        double areaCirculo;
        double volumenEsfera;
        final double pi= 3.14;
        
        System.out.println("Escribe  la longitud del radio");
        Scanner sc = new Scanner (System.in);
        
        longitudRadio= sc.nextDouble();
        longitudCircunferencia = 2* pi* longitudRadio;
        areaCirculo = pi* longitudRadio* longitudRadio;
        volumenEsfera = (4/3)* pi* longitudRadio* longitudRadio* longitudRadio;
        
        
        System.out.println("Los resultados son: ");
        System.out.println("Longitud de la circunferencia: "
                +longitudCircunferencia);
        System.out.println("Área del círculo: "+areaCirculo);
        System.out.println("Volumen de la esfera: "+volumenEsfera);
    }
}
