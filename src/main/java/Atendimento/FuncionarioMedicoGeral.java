package Atendimento;

public class FuncionarioMedicoGeral extends Funcionario{

    public FuncionarioMedicoGeral(Funcionario superior) {
        listaProntuarios.add(TipoProntuarioConsultaGeral.getTipoProntuarioConsultaGeral());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Médico Geral";
    }

}
