/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sensoriluminacion;

import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author Anita
 */
public class HiloSensor extends Thread{
    
    private boolean on;
    private double iluminacion;
    private PrintWriter pw;
    private Socket s;

    public HiloSensor(Socket s, PrintWriter pw) {
        this.on = on;
        this.iluminacion = 0.0;
        this.pw = pw;
        this.s = s;
    }
    
    public HiloSensor() {
        this.on = true;
        this.iluminacion = 0;
    }
    
    
    public double generarHumedad(){
    return ((double) Math.random()*100);
    }
    
    public void encender(){
        on = true;
    }
    
    public void apagar(){
        on = false;
    }
    
    public double leerHumedad(){
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
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.getLogger(HiloSensor.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
            
           
        }
    }
    
}
