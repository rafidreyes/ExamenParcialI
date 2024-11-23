/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionmedica_rr;

/**
 *
 * @author Rafael Reyes
 */
public class Persona {
    private String nombre_RR;
    private int edad_RR;
    private String direccion_RR;

    public Persona(String nombre_RR, int edad_RR, String direccion_RR) {
        this.nombre_RR = nombre_RR;
        this.edad_RR = edad_RR;
        this.direccion_RR = direccion_RR;
    }

    public String getNombre_RR() {
        return nombre_RR;
    }

    public void setNombre_RR(String nombre_RR) {
        this.nombre_RR = nombre_RR;
    }

    public int getEdad_RR() {
        return edad_RR;
    }

    public void setEdad_RR(int edad_RR) {
        this.edad_RR = edad_RR;
    }

    public String getDireccion_RR() {
        return direccion_RR;
    }

    public void setDireccion_RR(String direccion_RR) {
        this.direccion_RR = direccion_RR;
    }
    
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre_RR);
        System.out.println("Edad: " + edad_RR);
        System.out.println("Dirección: " + direccion_RR);
    }
    
}
