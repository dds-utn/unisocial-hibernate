package entities;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Aporte {
    private Usuario usuario;
    private Topico topico;
    private String nombre;
    private String descripcion;
    private ArrayList<Puntuacion> puntuaciones;
    private ArrayList<Archivo> archivos;

    public Aporte(){
        this.puntuaciones = new ArrayList<>();
        this.archivos = new ArrayList<>();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Topico getTopico() {
        return topico;
    }

    public void setTopico(Topico topico) {
        this.topico = topico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void agregarPuntuacion(Puntuacion puntuacion){
        this.puntuaciones.add(puntuacion);
        this.usuario.recibirPuntuacionDeAporte(puntuacion);
    }

    public int sumatoriaDePuntuaciones(){
        return this.puntuaciones.stream().mapToInt(p -> p.getPuntos()).sum();
    }
}