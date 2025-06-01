package Atendimento;

public class FuncionarioMedicoEmergencia extends Funcionario{

    public FuncionarioMedicoEmergencia(Funcionario superior) {
        listaProntuarios.add(TipoProntuarioEmergencia.getTipoProntuarioEmergencia());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Médico Emergencista";
    }

}
