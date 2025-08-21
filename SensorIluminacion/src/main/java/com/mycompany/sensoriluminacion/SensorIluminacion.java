/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sensoriluminacion;

/**
 *
 * @author Anita
 */
public class SensorIluminacion {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        
        HiloSensor sensor = new HiloSensor();
        sensor.run();
    }
}
