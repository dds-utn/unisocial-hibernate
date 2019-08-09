package entities;

import java.time.LocalDate;

public class Puntuacion {
    private Aporte aporte;
    private Usuario usuario;
    private int puntos;
    private LocalDate fecha;

    public Puntuacion(int puntos, Usuario usuario){
        this.setUsuario(usuario);
        this.setPuntos(puntos);
        this.setFecha(LocalDate.now());
    }

    public Aporte getAporte() {
        return aporte;
    }

    public void setAporte(Aporte aporte) {
        this.aporte = aporte;
        aporte.agregarPuntuacion(this);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    private void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getPuntos() {
        return puntos;
    }

    private void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    private void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}