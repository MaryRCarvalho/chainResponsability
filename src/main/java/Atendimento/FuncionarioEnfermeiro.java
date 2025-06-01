package Atendimento;

public class FuncionarioEnfermeiro extends Funcionario {


    public FuncionarioEnfermeiro(Funcionario superior) {
        listaProntuarios.add(TipoProntuarioTriagem.getTipoProntuarioTriagem());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Enfermeiro";
    }

}
