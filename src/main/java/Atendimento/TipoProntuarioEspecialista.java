package Atendimento;

public class TipoProntuarioEspecialista implements TipoProntuario{

    private static TipoProntuarioEspecialista tipoProntuarioEspecialista = new TipoProntuarioEspecialista();

    private TipoProntuarioEspecialista() {};

    public static TipoProntuarioEspecialista getTipoProntuarioEspecialista() {
        return tipoProntuarioEspecialista;
    }
}
