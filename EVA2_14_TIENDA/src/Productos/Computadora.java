/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Productos;

import SuperClases.Electronica;

/**
 *
 * @author invitado
 */
public final class Computadora extends Electronica{
    private int memoria;
    private double tamaño;
    private int discoDuro;

    public Computadora() {
        super();
        this.memoria = 0;
        this.tamaño = 0.0;
        this.discoDuro = 0;
    }

    public Computadora(int memoria, double tamaño, int discoDuro, String fabricante, String modelo, int garantia, double precio, String desc, String unidad) {
        super(fabricante, modelo, garantia, precio, desc, unidad);
        this.memoria = memoria;
        this.tamaño = tamaño;
        this.discoDuro = discoDuro;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public int getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(int discoDuro) {
        this.discoDuro = discoDuro;
    }
    
    
    @Override
    public double precioVenta(int cant){
        // despues de cierta cantidad, hay descuento
        if (cant <= 10)
            return precio * cant;
        else
            return (precio * 0.8) * cant;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Computadora{" + "Memoria: " + memoria + " GB, Tamaño de pantalla: " + tamaño + " pulgadas, Disco duro: " + discoDuro + " GB}";
    }
    
    
}
