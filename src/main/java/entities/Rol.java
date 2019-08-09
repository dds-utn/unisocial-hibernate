package entities;

import java.util.ArrayList;

public class Rol {
    private String nombre;
    private ArrayList<Permiso> permisos;

    public Rol(){
        this.permisos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}