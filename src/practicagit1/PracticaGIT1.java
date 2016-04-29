/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagit1;

import java.util.Scanner;

/**
 *
 * @author dam124
 */
public class PracticaGIT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int r,raiz;
        Scanner teclado = new Scanner(System.in);
        do{
         do {
            
         System.out.println("Qué operación quieres hacer?");
          System.out.println("Pulsa 1 para redondeo número");
          System.out.println("Pulsa 2 para raíz cuadrada");
          System.out.println("Pulsa 3 pra Potencia");
           System.out.println("Pulsa 4 para número aleatorio");
          System.out.println("Pulsa 0 para salir");
        
          r = teclado.nextInt();
        }
          while (r>=4 || r<0);
        
           switch (r){
            
               case 1:
                
                 double redondeo;
                 System.out.println("Introduce el número que quieres redondear");
                    redondeo = teclado.nextDouble();
                  long n=Math.round(redondeo);
                  System.out.println(redondeo+" redondeado es "+n);
                  break;
                
              case 2:
                    System.out.println("Introduce un número para calcular su raíz cuadrada");
                    raiz = teclado.nextInt();
                    System.out.println("La raíz cuadrada de " + raiz + " es " + Math.sqrt(raiz));
                   break;
                case 3:
                    int potencia,num;
                    double resultpot;
                    System.out.println("Introduce el número del que deseas calcular una potencia");
                    num = teclado.nextInt();
                    System.out.println("Introduce la potencia");
                    potencia = teclado.nextInt();
                    resultpot=Math.pow(num, potencia);
                    System.out.println(num+" elevado a "+potencia+" es igual a "+resultpot);
                    break;
                case 4:
                    System.out.println("Número aleatorio: "+Math.random()*100);
                    break;
                case 0:
                    System.out.println("FIN DEL PROGRAMAA");
            }
            }
        while (r!=0);
        System.out.println("este es el segundo commit");
    }
              }/// fin for..........................
          
          
    
    

