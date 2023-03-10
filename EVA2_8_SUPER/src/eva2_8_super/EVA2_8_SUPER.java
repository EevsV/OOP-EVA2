/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_8_super;

/**
 *
 * @author invitado
 */
public class EVA2_8_SUPER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal = new Animal(100);
        Mamifero mamifero = new Mamifero("cafe",120);
        Perros perro = new Perros();
    }
    
}

class Animal{
    private int peso;
    
    public Animal(){
        System.out.println("it's alive");
    }
    
    public Animal(int peso){
        System.out.println("it's alive the sequel");
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public void respirar(){
        System.out.println("respira");
    }
    
    public void comer(){
        System.out.println("come");
    }
    
    
}

class Mamifero extends Animal{
    private String colorPelo;
    public Mamifero(){
        super(); // LLamada al constructor de la superclase
        //Siempre llamar al constructor de la superclase primero
        System.out.println("soy mamifero");
    }

    public Mamifero(String colorPelo, int peso) {
        super(peso);
        this.colorPelo = colorPelo;
        System.out.println("mamifero la sequela");
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }
    
    
    
    
}

class Perros extends Mamifero{
    public Perros(){
        System.out.println("deez");
}
}