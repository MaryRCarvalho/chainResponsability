package Atendimento;

public class TipoProntuarioEmergencia implements TipoProntuario{

    private static TipoProntuarioEmergencia tipoProntuarioEmergencia = new TipoProntuarioEmergencia();

    private TipoProntuarioEmergencia() {};

    public static TipoProntuarioEmergencia getTipoProntuarioEmergencia() {
        return tipoProntuarioEmergencia;
    }

}
