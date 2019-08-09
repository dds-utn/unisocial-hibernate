package entities;

import java.util.ArrayList;

public class BuenaReputacion extends Reputacion {

    @Override
    public void recibirPuntuacionDeAporte(Puntuacion puntuacion, Usuario usuario){
        ArrayList<Aporte> aportes = usuario.getAportes();
        int sumaPuntuaciones = sumaPuntuaciones(aportes);
        int cantidadAportes = aportes.size();
        verificarBuenaReputacion(sumaPuntuaciones, cantidadAportes, usuario);
    }

    private int sumaPuntuaciones(ArrayList<Aporte> aportes){
        return aportes.stream().mapToInt(a -> a.sumatoriaDePuntuaciones()).sum();
    }

    private void verificarBuenaReputacion(int sumatoriaPuntuaciones, int cantidadAportes, Usuario usuario){
        if((sumatoriaPuntuaciones/cantidadAportes)*2 <3){
            usuario.setReputacion(new MalaReputacion());
        }
    }
}
