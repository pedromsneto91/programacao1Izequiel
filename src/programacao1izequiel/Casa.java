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
public class Casa {
    private int comodos;
    private int portas;
    private int janelas;
    private int mobilia;
    
    private boolean temCerca;
    private boolean temCameras;
    private boolean eNova;
    
    public void estado(){
        System.out.println("Comodos: " + this.comodos);
        System.out.println("Portas: " + this.portas);
        System.out.println("Janelas: " + this.janelas);
        System.out.println("Mobilia: " + this.mobilia);
        System.out.println("Tem cerca? " + this.temCerca);
        System.out.println("Tem câmeras? " + this.temCameras);
        System.out.println("É nova? " + this.eNova);
    }
}
