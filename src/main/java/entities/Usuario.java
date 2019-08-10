package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String apellido;
    private LocalDate fechaDeNacimiento;
    private int telefono;
    private int legajo;
    private Reputacion reputacion;
    private List<Aporte> aportes;

    public Usuario(){
        this.aportes = new ArrayList<>();
        this.reputacion = new BuenaReputacion();
    }

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

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public Reputacion getReputacion() {
        return reputacion;
    }

    public void setReputacion(Reputacion reputacion) {
        this.reputacion = reputacion;
    }

    public List<Aporte> getAportes() {
        return aportes;
    }

    public void puntuar(Aporte unAporte, int puntos){
        Puntuacion puntuacion = new Puntuacion(puntos, this);
        puntuacion.setAporte(unAporte);
    }

    public void recibirPuntuacionDeAporte(Puntuacion puntuacion){
        this.reputacion.recibirPuntuacionDeAporte(puntuacion, this);
    }
}
