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
        
        /*HiloSensor sensor = new HiloSensor();
        sensor.run();*/
        InetAddress ipServidor = null;
        PrintWriter pw;
        try {
            ipServidor = InetAddress.getByName("localhost");
            Socket cliente = new Socket(ipServidor, 20000);
            System.out.println(cliente);
            pw = new PrintWriter(cliente.getOutputStream(), true); //El segundo parametro activa el autoflush para escribir en el buffer
            pw.println("iluminacion");
            HiloSensor sensor = new HiloSensor(cliente, pw);
            sensor.encender();
            sensor.start();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        
    }
}
