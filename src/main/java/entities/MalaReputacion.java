package entities;

public class MalaReputacion extends Reputacion {

    @Override
    public void chanceParaAportar(Usuario usuario){
        usuario.setReputacion(new BuenaReputacion());
    }
}
