package Atendimento;

public class TipoProntuarioConsultaGeral implements TipoProntuario{

    private static TipoProntuarioConsultaGeral tipoProntuarioConsultaGeral = new TipoProntuarioConsultaGeral();

    private TipoProntuarioConsultaGeral() {};

    public static TipoProntuarioConsultaGeral getTipoProntuarioConsultaGeral() {
        return tipoProntuarioConsultaGeral;
    }
}
