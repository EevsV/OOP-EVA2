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
public class EVA2_18_POLYMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante e1 = new Estudiante("bean", "er", 35, "2425415");
        //e1.imprimirDatos();
        Docente d1 = new Docente("mr beas","mr","beast",43);
       // d1.imprimirDatos();
        Persona p1 = d1;
        p1.imprimirDatos();
        Persona per2 = e1;
        per2.imprimirDatos();
        
        //conversiones no se pueden hacer al reves
        Persona p3 = new Persona();
        //Estudiante e2 = p3;
    }
    
}
