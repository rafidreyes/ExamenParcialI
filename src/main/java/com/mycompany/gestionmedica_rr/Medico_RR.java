/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionmedica_rr;

/**
 *
 * @author Rafael Reyes
 */
public class Medico_RR  extends Persona {
    
    private String especialidad_RR;
    private int aniosExperiencia_RR;

    public Medico_RR(String especialidad_RR, int aniosExperiencia_RR, String nombre_RR, int edad_RR, String direccion_RR) {
        super(nombre_RR, edad_RR, direccion_RR);
        this.especialidad_RR = especialidad_RR;
        this.aniosExperiencia_RR = aniosExperiencia_RR;
    }

    public String getEspecialidad_RR() {
        return especialidad_RR;
    }

    public void setEspecialidad_RR(String especialidad_RR) {
        this.especialidad_RR = especialidad_RR;
    }

    public int getAniosExperiencia_RR() {
        return aniosExperiencia_RR;
    }

    public void setAniosExperiencia_RR(int aniosExperiencia_RR) {
        this.aniosExperiencia_RR = aniosExperiencia_RR;
    }
    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Especialidad: " + especialidad_RR);
        System.out.println("Años de experiencia: " + aniosExperiencia_RR);
    }
    
}
