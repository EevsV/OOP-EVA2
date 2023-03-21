/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_14_tienda;

import Productos.Computadora;
import Productos.Jeans;

/**
 *
 * @author invitado
 */
public class EVA2_14_TIENDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computadora compu = new Computadora();
        compu.setPrecio(100);
        
        Computadora comp2 = new Computadora(4, 16, 1024, "Intel", "Toyota", 3, 100.00, "Laptop", "u");
        System.out.println(comp2);
        System.out.println("El precio de venta de 5 " + comp2.getDesc() +"s sera: " + comp2.precioVenta(5) +"$");
        System.out.println("El precio de venta de 11 " + comp2.getDesc() +"s sera: " + comp2.precioVenta(11) +"$");
        
        System.out.println("----");
        
        Jeans jean1 = new Jeans('M', "Cuero", "Toyota", "XL", "Supreme", "Azul", 50.00, "Supants", "pz");
        System.out.println(jean1);
        System.out.println("El precio de venta de 5 " + jean1.getDesc() +" sera: " + jean1.precioVenta(5) +"$");
        System.out.println("El precio de venta de 11 " + jean1.getDesc() +" sera: " + jean1.precioVenta(11) +"$");
    }
    
}
