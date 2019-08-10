package entities;

import java.util.ArrayList;
import java.util.List;

public class BuenaReputacion extends Reputacion {

    @Override
    public void recibirPuntuacionDeAporte(Puntuacion puntuacion, Usuario usuario){
        List<Aporte> aportes = usuario.getAportes();
        int sumaPuntuaciones = sumaPuntuaciones(aportes);
        int cantidadAportes = aportes.size();
        verificarBuenaReputacion(sumaPuntuaciones, cantidadAportes, usuario);
    }

    private int sumaPuntuaciones(List<Aporte> aportes){
        return aportes.stream().mapToInt(a -> a.sumatoriaDePuntuaciones()).sum();
    }

    private void verificarBuenaReputacion(int sumatoriaPuntuaciones, int cantidadAportes, Usuario usuario){
        if((sumatoriaPuntuaciones/cantidadAportes)*2 <3){
            usuario.setReputacion(new MalaReputacion());
        }
    }
}
