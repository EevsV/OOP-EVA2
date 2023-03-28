/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_20_polimorfismo_figuras;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_20_POLIMORFISMO_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Circulo c1 = new Circulo(5);
        c1.imprimirDatos();
        
        Figuras figu = c1;
        
        System.out.println(figu.calcularArea);
        System.out.println(figu.calcularPerimetro);*/
        
       /* int[] arreglo = new int[10];
        
        arreglo[0] = 100;
        
        System.out.println(arreglo[0]); */
        
        System.out.println("cuantas fiugras queitrnisdnhkj");
        
        Scanner input = new Scanner(System.in);
        
        int cant = input.nextInt();
       Figuras[] figuras = new Figuras[cant];
        
        for (int i = 0; i < figuras.length; i++) {
            System.out.println("Que figura necesitas? (1. Circulo, 2. Triangulo");
            int tipo = input.nextInt();
            if(tipo == 1){
                Circulo circu = new Circulo();
                System.out.println("Ingresa el radio");
                circu.setRadio(input.nextDouble());
                figuras[i] = circu;
            }
            else{
                Triangulo trian = new Triangulo();
                System.out.println("Ingresa la altura");
                trian.setAltura(input.nextDouble());
                System.out.println("Ingresa la base");
                trian.setBase(input.nextDouble());
                figuras[i] = trian;
            }
        }
        
        for (int i = 0; i < figuras.length; i++) {
            System.out.println("Figura: " + i);
            System.out.println("Area: " + figuras[i].calcularArea());
            System.out.println("Perimetro: " + figuras[i].calcularPerimetro());
        }
    }
    
}
