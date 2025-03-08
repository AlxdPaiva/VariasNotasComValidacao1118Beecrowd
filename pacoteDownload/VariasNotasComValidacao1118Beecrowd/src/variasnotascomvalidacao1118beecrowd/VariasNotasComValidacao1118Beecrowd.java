/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package variasnotascomvalidacao1118beecrowd;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class VariasNotasComValidacao1118Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int X = 0;      
                
        while (X != 2) {
            
            float nota1 = teclado.nextFloat();
            while (nota1 < 0 || nota1 > 10){                
                System.out.println("nota invalida");
                nota1 = teclado.nextFloat();
            }          
                        
            float nota2 = teclado.nextFloat();                        
            while (nota2 < 0 || nota2 > 10){                
                System.out.println("nota invalida");
                nota2 = teclado.nextFloat();
            }
            
            float media;            
            media = (nota1+nota2)/2;
            System.out.println(String.format("media = %.2f", media));
            
            System.out.println("novo calculo (1-sim 2-nao)");
            X = teclado.nextInt();
            if (X == 1) {
                continue;
            } 
            
            while (X > 2) {
                System.out.println("novo calculo (1-sim 2-nao)");
                X = teclado.nextInt();
            }
            
        }
        
    }
    
}
