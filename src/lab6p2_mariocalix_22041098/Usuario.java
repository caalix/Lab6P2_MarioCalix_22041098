/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_mariocalix_22041098;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mario
 */
public class Usuario {
    
    private String nombre, apellido, usuario, contrasena;
    private Date fechaNacimiento;
    private Color colorFav;
    private ArrayList<Pokedex> pokedexes = new ArrayList(3);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Color getColorFav() {
        return colorFav;
    }

    public void setColorFav(Color colorFav) {
        this.colorFav = colorFav;
    }

    public ArrayList<Pokedex> getPokedexes() {
        return pokedexes;
    }

    public void setPokedexes(ArrayList<Pokedex> pokedexes) {
        this.pokedexes = pokedexes;
    }

    public Usuario(String nombre, String apellido, String usuario, String contrasena, Date fechaNacimiento, Color colorFav) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.fechaNacimiento = fechaNacimiento;
        this.colorFav = colorFav;
    }

    public Usuario() {
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", usuario=" + usuario + ", contrasena=" + contrasena + ", fechaNacimiento=" + fechaNacimiento + ", colorFav=" + colorFav + ", pokedexes=" + pokedexes + '}';
    }
    
}
