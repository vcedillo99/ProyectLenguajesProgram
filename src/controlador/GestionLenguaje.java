/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.LenguajeProgramacion;

/**
 *
 * @author Grey Cedillo
 */
public class GestionLenguaje {
    
    private static final int FACTOR_CRECIMIENTO = 2;
    private static LenguajeProgramacion[] ArregloLenguajes = new LenguajeProgramacion[FACTOR_CRECIMIENTO];
    private static int ContadorLenguajes = 0;
    
    public static void AgregarLenguaje(int anioCreacion, String caracteristicaPrincipal, String nombre, String utilizacion) {
        if (ContadorLenguajes == ArregloLenguajes.length) {
            LenguajeProgramacion[] nuevoArreglo = new LenguajeProgramacion[ArregloLenguajes.length + FACTOR_CRECIMIENTO];
            System.arraycopy(ArregloLenguajes, 0, nuevoArreglo, 0, ArregloLenguajes.length);
            ArregloLenguajes = nuevoArreglo;
        }
        
        ArregloLenguajes[ContadorLenguajes++] = new LenguajeProgramacion(anioCreacion, caracteristicaPrincipal, nombre, utilizacion);
    }
    
    public static LenguajeProgramacion BuscarLenguaje(String nombre) {
        for (int i = 0; i < ContadorLenguajes; i++) {
            if (ArregloLenguajes[i].getNombre().equals(nombre)) {
                return ArregloLenguajes[i];
            }
        }
        return null;
    }
    
    public static boolean EliminarLenguaje(String nombre) {
        for (int i = 0; i < ContadorLenguajes; i++) {
            if (ArregloLenguajes[i].getNombre().equals(nombre)) {
                for (int j = i; j < ContadorLenguajes - 1; j++) {
                    ArregloLenguajes[j] = ArregloLenguajes[j + 1];
                }
                ArregloLenguajes[--ContadorLenguajes] = null;
                return true;
            }
        }
        return false;
    }
    
    public static LenguajeProgramacion[] GetArregloLenguajes() {
        return ArregloLenguajes;
    }
    
    public static void ImprimirLenguajes() {
        for (int i = 0; i < ContadorLenguajes; i++) {
            System.out.println(ArregloLenguajes[i]);
        }
    }
    
}
