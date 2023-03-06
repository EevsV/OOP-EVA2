/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MisClases;

/**
 *
 * @author invitado
 */
public class Persona {
    private String id;
    private String nombre;
    private int edad;
    
    public void setID(String x){
        id = x;
    }
    public void setNombre(String x){
        nombre = x;
    }
    public void setEdad(int x){
        edad = x;
    }
    
    public String getID(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    
    public void imprimirDatos(){
        System.out.println("ID: "+id);
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
}


