/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_13_bucles_nivel_maestrojedi;
import java.util.Scanner;
/**
 *
 * @author Víctor Quirós Pavón
 */
public class Ejercicio_13_Bucles_Nivel_MaestroJedi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num;
        int max;
        int min;
        int anterior;
        char resultado;
        boolean seguir;
        
        
        max = 100;
        min = 0;
        anterior = 0;
        seguir = true;
        
        
        System.out.println("Piensa un número y escribe >, < o = según el "
        + "número que has pensado");
        
       // do {
       //   num = sc.nextInt();
       //     if (num > 50) {
       //          nmenor = 50;
       //          num = sc.nextInt();
       //          if (num > 75) {
       //              nmenor = 75;
                    // num = sc.nextInt();
                   //  if (num > 83) {
                    //     nmenor = 83;
                     //    num = sc.nextInt();    
                     //}
                   //  else;{
                  //   nmayor = 83;
                  //   num = sc.nextInt();
                 //   }
              //  }
              //   else;{
               //     nmayor = 75;
                //    num = sc.nextInt();
          //      }
         //   }
        //    else;{             
      //          nmayor = 50;
        //        num = sc.nextInt();
       // } while ( = );
        
       
        while (seguir) {
            num = (max+min)/2;
            
            System.out.println("50 | >, < o =");
            resultado = sc.next().charAt(0);
            
            switch (resultado) {
            case '>':
                max = num;
                anterior = num;
            case '<':
                min = num;
                anterior = num;
            case '=':
                seguir = false;
                
                break;
            default:
                throw new AssertionError();
        }
        }
        
        
        
        
        
        
    }
    
}
