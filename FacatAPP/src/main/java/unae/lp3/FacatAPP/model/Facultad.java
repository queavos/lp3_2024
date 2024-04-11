/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unae.lp3.FacatAPP.model;

/**
 *
 * @author ossva
 */
public class Facultad {

    private String nombre;
    private String sigla;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Facultad() {
    }

    @Override
    public String toString() {
        return "Facultad{" + "nombre=" + nombre + ", sigla=" + sigla + '}';
    }

}
