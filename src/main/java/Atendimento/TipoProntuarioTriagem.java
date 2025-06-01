package Atendimento;

public class TipoProntuarioTriagem implements TipoProntuario{

    private static TipoProntuarioTriagem tipoProntuarioTriagem = new TipoProntuarioTriagem();

    private TipoProntuarioTriagem() {};

    public static TipoProntuarioTriagem getTipoProntuarioTriagem() {
        return tipoProntuarioTriagem;
    }
}
