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
public class Fantasma extends Pokemon{
    private String tipo="Fantasma";

    public Fantasma() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Fantasma{" + "tipo=" + tipo + '}';
    }
    
}
