/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_10_override;

/**
 *
 * @author invitado
 */
public class EVA2_10_OVERRIDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona("jeff",526);
        Persona p2 = new Persona("jose.gonzales.2010",13);
        Persona p3 = new Persona("pewdiepie2",1);
        System.out.println(p1);
        System.out.println("---");
        System.out.println(p2);
        System.out.println("---");
        System.out.println(p3);
        System.out.println("---");
    }
    
}


class Persona{
    private String Nombre;
    private int edad;

    public Persona() {
        this.Nombre = "joe";
        this.edad = 25;
    }

    public Persona(String Nombre, int edad) {
        this.Nombre = Nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString(){
      String cade = "DATOS: \n" +
                     "Nombre: " + Nombre + "\n" +
                     "Edad: " + edad;
      return cade;  
    }
}