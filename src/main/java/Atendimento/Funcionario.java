package Atendimento;

import java.util.ArrayList;

public abstract class Funcionario {

    protected ArrayList listaProntuarios = new ArrayList();
    private Funcionario funcionarioSuperior;

    public Funcionario getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(Funcionario funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }

    public abstract String getDescricaoCargo();

    public String assinarProntuario(Prontuario prontuario) {
        if (listaProntuarios.contains(prontuario.getTipoProntuario())) {
            return getDescricaoCargo();
        }
        else {
            if (funcionarioSuperior != null) {
                return funcionarioSuperior.assinarProntuario(prontuario);
            }
            else
            {
                return "Sem assinatura";
            }
        }
    }
}
