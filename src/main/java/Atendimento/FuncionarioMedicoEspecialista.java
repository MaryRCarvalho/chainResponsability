package Atendimento;

public class FuncionarioMedicoEspecialista extends Funcionario{

    public FuncionarioMedicoEspecialista(Funcionario superior) {
        listaProntuarios.add(TipoProntuarioEspecialista.getTipoProntuarioEspecialista());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Médico Especialista";
    }

}
