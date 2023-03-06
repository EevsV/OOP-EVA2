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
public class Television {
    private int canal;
    private int vol;
    private boolean power;
    
    public void setCanal(int x){
        canal = x;
    }
    public void setVol(int x){
        vol = x;
    }
    public void setPower(boolean x){
        power = x;
    }
    
    public int getCanal(){
        return canal;
    }
    public int getVol(){
        return vol;
    }
    public boolean getPower(){
        return power;
    }
    
    public void imprimirDatos(){
        System.out.println("Canal: "+canal);
        System.out.println("Volumen: "+vol);
        System.out.println("Power: "+power);
    }
}
