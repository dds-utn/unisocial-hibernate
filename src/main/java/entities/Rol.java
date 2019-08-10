package entities;

import java.util.ArrayList;
import java.util.List;

public class Rol {
    private String nombre;
    private List<Permiso> permisos;

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