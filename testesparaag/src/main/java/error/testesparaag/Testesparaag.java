/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package error.testesparaag;

import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.Random;

/**
 *
 * @author LVI
 */
public class Testesparaag {

    public static void main(String[] args) {
       int contador = 0;
       int contador2 =256;
       //Random random = new Random(); 
        // System.out.println("Hello World!");
    while(contador < contador2){
       // double number = random.nextDouble();
      //  System.out.println(number);

        double numeroRealAleatorio_0_a_1 = Math.random() *2;
        System.out.println("Número real aleatório de 0 até 1: " + numeroRealAleatorio_0_a_1);
    }
    }
}
