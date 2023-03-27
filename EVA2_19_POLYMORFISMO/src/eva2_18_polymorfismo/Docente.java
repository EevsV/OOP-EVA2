/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_18_polymorfismo;

/**
 *
 * @author invitado
 */
public class Docente extends Persona {
    private String plaza;

    public Docente() {
        plaza = "eee";
    }

    public Docente(String plaza, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.plaza = plaza;
    }

    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
    
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("No. Plaza: "+plaza);
    }
    
}
