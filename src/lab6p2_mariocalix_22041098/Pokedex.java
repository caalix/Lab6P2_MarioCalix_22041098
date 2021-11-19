/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_mariocalix_22041098;

import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class Pokedex {
    private ArrayList<Pokemon> pokemones = new ArrayList(3);
    private int danoProm;

    public Pokedex() {
    }

    public Pokedex(int danoProm) {
        this.danoProm = danoProm;
    }

    public ArrayList<Pokemon> getPokemones() {
        return pokemones;
    }

    public void setPokemones(ArrayList<Pokemon> pokemones) {
        this.pokemones = pokemones;
    }

    public int getDanoProm() {
        return danoProm;
    }

    public void setDanoProm(int danoProm) {
        this.danoProm = danoProm;
    }

    @Override
    public String toString() {
        return "Pokedex{" + "pokemones=" + pokemones + ", danoProm=" + danoProm + '}';
    }
    
}
