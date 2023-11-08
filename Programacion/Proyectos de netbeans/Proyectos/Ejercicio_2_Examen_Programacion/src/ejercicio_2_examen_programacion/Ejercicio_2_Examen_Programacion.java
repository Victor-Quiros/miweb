/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_examen_programacion;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_2_Examen_Programacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int nmayor;
        int cont;
        int fallo;
        int acierto;
        int trescif;

        nmayor = 0;
        cont = 0;
        fallo = 0;
        acierto = 0;
        trescif = 0;

        System.out.println("Escribe una serie de números");
        do {
            num = sc.nextInt();
            if (num != 0) {
                cont = cont + 1;
            }
            if (num > nmayor) {
                nmayor = num;
                acierto = acierto + 1;

            } else {
                fallo = fallo + 1;

                if (num == 0) {
                    fallo = fallo - 1;
                }

            }
            if (num > 99) {
                trescif = trescif + 1;

            }

        } while (num != 0);

        System.out.println("El total de números introducidos, excluido el 0 son " + cont);
        System.out.println("El total de números fallados son " + fallo);
        System.out.println("El total de números de más de 2 cifras introducidos (fallados o no) es " + trescif);

    }
}
