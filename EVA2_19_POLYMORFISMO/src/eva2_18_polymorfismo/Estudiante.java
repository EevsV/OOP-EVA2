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
public class Estudiante extends Persona{
    private String noControl;

    public Estudiante() {
    }
    
    public Estudiante(String n, String a, int e, String c){
        super(n, a, e);
        noControl = c;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("No de control: "+ noControl);
        
    }
    
    
}
