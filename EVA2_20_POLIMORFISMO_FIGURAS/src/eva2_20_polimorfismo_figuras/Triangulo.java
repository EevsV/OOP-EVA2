/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_20_polimorfismo_figuras;

/**
 *
 * @author invitado
 */
public class Triangulo implements  Figuras, MostrarDatos {
    private double base;
    private double altura;
    
    
    public Triangulo(){
        this.base = 0;
        this.altura = 0;
    }

    public Triangulo(double base, double altura) {
        this.base = 0;
        this.altura = 0;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("codigo todo beaner");
    }

    @Override
    public double calcularArea() {
        return (base*altura)/2;
    }

    @Override
    public double calcularPerimetro() {
        double hipo = Math.sqrt((base*base)+(altura*altura));
        return base + altura + hipo;
    }
    
    
    
    
}
