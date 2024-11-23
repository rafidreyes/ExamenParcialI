/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionmedica_rr;

/**
 *
 * @author Rafael Reyes
 */
public class Paciente_RR extends Persona {
    
    private int nroHistorial_RR;
    private String enfermedad_RR;

    public Paciente_RR(int nroHistorial_RR, String enfermedad_RR, String nombre_RR, int edad_RR, String direccion_RR) {
        super(nombre_RR, edad_RR, direccion_RR);
        this.nroHistorial_RR = nroHistorial_RR;
        this.enfermedad_RR = enfermedad_RR;
    }

    public int getNroHistorial_RR() {
        return nroHistorial_RR;
    }

    public void setNroHistorial_RR(int nroHistorial_RR) {
        this.nroHistorial_RR = nroHistorial_RR;
    }

    public String getEnfermedad_RR() {
        return enfermedad_RR;
    }

    public void setEnfermedad_RR(String enfermedad_RR) {
        this.enfermedad_RR = enfermedad_RR;
    }
    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de Historial: " + nroHistorial_RR);
        System.out.println("Enfermedad: " + enfermedad_RR);
    }
}
