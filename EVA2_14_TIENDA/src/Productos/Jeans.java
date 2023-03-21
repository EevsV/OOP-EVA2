/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Productos;

import SuperClases.Ropa;

/**
 *
 * @author invitado
 */
public final class Jeans extends Ropa{
    private char genero;
    private String material;
    private String corte;

    public Jeans() {
        super();
        this.genero = 'u';
        this.material = "";
        this.corte = "";
    }

    public Jeans(char genero, String material, String corte, String talla, String marca, String color, double precio, String desc, String unidad) {
        super(talla, marca, color, precio, desc, unidad);
        this.genero = genero;
        this.material = material;
        this.corte = corte;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCorte() {
        return corte;
    }

    public void setCorte(String corte) {
        this.corte = corte;
    }

    @Override
    public double precioVenta(int cant) {
        if (cant <= 10)
            return getPrecio() * cant;
        else
            return (getPrecio() * 0.8) * cant;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Jeans{" + "Genero: " + genero + ", Material: " + material + ", Corte: " + corte + '}';
    }
    
    
}
