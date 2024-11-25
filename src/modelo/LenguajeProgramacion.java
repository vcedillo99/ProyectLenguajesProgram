/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Grey Cedillo
 */
public class LenguajeProgramacion {
    private int AnioCreacion;
    private String CaracteristicaPrincipal;
    private String Nombre;
    private String Utilizacion;

    public LenguajeProgramacion(int AnioCreacion, String CaracteristicaPrincipal, String Nombre, String Utilizacion) {
        this.AnioCreacion = AnioCreacion;
        this.CaracteristicaPrincipal = CaracteristicaPrincipal;
        this.Nombre = Nombre;
        this.Utilizacion = Utilizacion;
    }

    public int getAnioCreacion() {
        return AnioCreacion;
    }

    public void setAnioCreacion(int AnioCreacion) {
        this.AnioCreacion = AnioCreacion;
    }

    public String getCaracteristicaPrincipal() {
        return CaracteristicaPrincipal;
    }

    public void setCaracteristicaPrincipal(String CaracteristicaPrincipal) {
        this.CaracteristicaPrincipal = CaracteristicaPrincipal;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUtilizacion() {
        return Utilizacion;
    }

    public void setUtilizacion(String Utilizacion) {
        this.Utilizacion = Utilizacion;
    }
    
    @Override
    public String toString() {
        return "Lenguaje: " + Nombre + " (" + AnioCreacion + ")\n" +
               "Característica: " + CaracteristicaPrincipal + "\n" +
               "Uso: " + Utilizacion;
    }
}
