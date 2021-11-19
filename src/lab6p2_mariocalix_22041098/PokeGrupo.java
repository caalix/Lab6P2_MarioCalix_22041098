/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_mariocalix_22041098;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mario
 */
public class PokeGrupo {
    private String nombre;
    private ArrayList<Usuario> miembros = new ArrayList();
    private Date fecha_creacion;

    public PokeGrupo() {
    }

    public PokeGrupo(String nombre, Date fecha_creacion) {
        this.nombre = nombre;
        this.fecha_creacion = fecha_creacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Usuario> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Usuario> miembros) {
        this.miembros = miembros;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
