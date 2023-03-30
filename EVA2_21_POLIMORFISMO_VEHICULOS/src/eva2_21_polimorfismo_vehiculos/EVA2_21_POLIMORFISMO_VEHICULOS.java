/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_21_polimorfismo_vehiculos;

/**
 *
 * @author invitado
 */
public class EVA2_21_POLIMORFISMO_VEHICULOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil auto1 = new Automovil("Toyota",0,"Toyota",1969);
        Bicicleta bici1 = new Bicicleta("Montaña","Toyota",0);
        
        modificarVel(auto1, 20);
        modificarVel(bici1, 10);
    }
    
    public static void modificarVel(ControlarDatos datos, int vel){
        datos.cambiarVelocidad(vel);
        datos.tablero();
    }
}
    
    
    class Vehiculo{
        private String Marca;
        protected int velocidad;

        public Vehiculo() {
            this.Marca = "----";
            this.velocidad = 0;
        }

        public Vehiculo(String Marca, int velocidad) {
            this.Marca = Marca;
            this.velocidad = velocidad;
        }

        public String getMarca() {
            return Marca;
        }

        public void setMarca(String Marca) {
            this.Marca = Marca;
        }

        public int getVelocidad() {
            return velocidad;
        }

        public void setVelocidad(int velocidad) {
            this.velocidad = velocidad;
        }
        
        
    }
    
    class Automovil extends Vehiculo implements ControlarDatos{
       private String modelo;
       private int año;

        public Automovil() {
            super();
            this.año = 0;
            this.modelo = "----";
        }

        public Automovil(String marca, int velocidad, String modelo, int año) {
            super(marca, velocidad);
            this.modelo = modelo;
            this.año = año;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public int getAño() {
            return año;
        }

        public void setAño(int año) {
            this.año = año;
        }

        @Override
        public void cambiarVelocidad(int cambio) {
            int vel = velocidad + cambio;
            if(vel >= 0){
                velocidad = vel;
            }
        }

        @Override
        public void tablero() {
            System.out.println("AUTOMOVIL");
            System.out.println("Velocidad: " + velocidad);
            System.out.println("Combustible: (pendiente)");
            System.out.println("Revoluciones: (pendiente)");
        }
       
       
    }
    
    class Bicicleta extends Vehiculo implements ControlarDatos{
        private String tipo;

        public Bicicleta() {
            super();
            this.tipo = "----";
           
        }

        public Bicicleta(String tipo, String Marca, int velocidad) {
            super(Marca, velocidad);
            this.tipo = tipo;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        @Override
        public void cambiarVelocidad(int cambio) {
            int vel = velocidad + cambio;
            if(vel >= 0){
                velocidad = vel;
            }
        }

        @Override
        public void tablero() {
            System.out.println("BICICLETA");
            System.out.println("Velocidad: " + velocidad);
        }
        
        
    }
    

