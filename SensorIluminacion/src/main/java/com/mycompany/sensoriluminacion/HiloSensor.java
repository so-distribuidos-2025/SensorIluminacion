/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sensoriluminacion;

/**
 *
 * @author Anita
 */
public class HiloSensor {
    
    private boolean on;
    private float iluminacion;

    public HiloSensor(boolean on, float humedad) {
        this.on = on;
        this.iluminacion = humedad;
    }
    
    public HiloSensor() {
        this.on = true;
        this.iluminacion = 0;
    }
    
    
    public float generarHumedad(){
    return ((float) Math.random()*100);
    }
    
    public void encender(){
        on = true;
    }
    
    public void apagar(){
        on = false;
    }
    
    public float leerHumedad(){
    return iluminacion;
    }
    
    public void run(){
        /*en este while medimos la iluminacion*/
        while(on/*o while(on)*/){
            /*this.iluminacion = generarHumedad();
            System.out.println("Humedad: " + leerHumedad());*/
             try {
                //System.out.println("Iluminación: " + leerHumedad());
                this.iluminacion = generarHumedad();
                pw.println(iluminacion);
                sleep(1000);
            } catch (InterruptedException ex) {
                System.getLogger(HiloSensor.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
            
           
        }
    }
    
}
