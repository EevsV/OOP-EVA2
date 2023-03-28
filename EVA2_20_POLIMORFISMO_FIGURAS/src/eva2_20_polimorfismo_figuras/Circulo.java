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
public class Circulo implements  Figuras, MostrarDatos {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    Circulo() {
        this.radio = 0;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Area " + calcularArea());
        System.out.println("PEeri " + calcularPerimetro());
    }

    @Override
    public double calcularArea() {
        return (radio*radio)*Math.PI;
    }

    @Override
    public double calcularPerimetro() {
        return (radio*2)*Math.PI;
    }
    
}
