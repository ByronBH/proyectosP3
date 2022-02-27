/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Byron
 */
public class Aplicacion {
    int id_aplicacion;
    String nombre_aplicacion;
    String estado_aplicacion;

    public Aplicacion() {
    }

    public Aplicacion(int id_aplicacion) {
        this.id_aplicacion= id_aplicacion;
    }

    public Aplicacion(String nombre_aplicacion, String estado_aplicacion) {
        this.nombre_aplicacion = nombre_aplicacion;
        this.estado_aplicacion= estado_aplicacion;
    }

    public int getId_app() {
        return id_aplicacion;
    }

    public void setId_app(int id_aplicacion) {
        this.id_aplicacion = id_aplicacion;
    }

    public String getNombreApp() {
        return nombre_aplicacion;
    }

    public void setNombreApp(String nombre_aplicacion) {
        this.nombre_aplicacion = nombre_aplicacion;
    }

    public String getEstadoApp() {
        return estado_aplicacion;
    }

    public void setEstadoApp(String estado_aplicacion) {
        this.estado_aplicacion = estado_aplicacion;
    }

    @Override
    public String toString() {
        return "Aplicacion{" + "id_vendedor=" + id_aplicacion + ", nombreVendedor=" + nombre_aplicacion+ ", direVendedor=" + estado_aplicacion + '}';
    }
    
    
}
