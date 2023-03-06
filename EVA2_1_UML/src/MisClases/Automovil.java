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
public class Automovil {
    private String marca;
    private String modelo;
    private int año;
    
    public void setMarca(String x){
        marca = x;
    }
    public void setModelo(String x){
        modelo = x;
    }
    public void setAño(int x){
        año = x;
    }
    
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getAño(){
        return año;
    }
    
    public void imprimirDatos(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Año: "+año);
    }
}
