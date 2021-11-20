/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_mariocalix_22041098;

/**
 *
 * @author mario
 */
public class Pokemon {
    private String nombre, velocidad,tipo;
    private int dano, vida;

    public Pokemon() {
    }

    public Pokemon(String nombre, String velocidad, String tipo, int dano, int vida) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.tipo = tipo;
        this.dano = dano;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
