/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacao1izequiel;

/**
 *
 * @author Pedro Moreira
 */
public class Carro {
    public int portas;
    private double motor;
    
    public boolean temArCondicionado;
    
    public double getMotor(){
        return this.motor;
    }
    public void setMotor(double m){
        this.motor = m;
    }
    
    public void estado(){
        System.out.println("Quantas portas?" + this.portas);
        System.out.println("Motor: " + this.getMotor());
        System.out.println("Tem ar condicionado? " + this.temArCondicionado);
        
        //System.out.println("");
    }
}
