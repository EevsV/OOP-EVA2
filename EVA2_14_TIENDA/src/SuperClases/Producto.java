/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SuperClases;

/**
 *
 * @author invitado
 */
public abstract class Producto {
    protected double precio;
    private String desc;
    private String unidad;

    public Producto() {
        this.precio = 0;
        this.desc = "";
        this.unidad = "";
    }
   

    public Producto(double precio, String desc, String unidad) {
        this.precio = precio;
        this.desc = desc;
        this.unidad = unidad;
    }
    
    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
    
    
    public abstract double precioVenta(int cant);

    @Override
    public String toString() {
        return "Producto{" + "Precio: " + precio + "$, Nombre: " + desc + ", Unidad: " + unidad + '}';
    }
    
    
}
