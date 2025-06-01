package Atendimento;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProntuarioTest {

    FuncionarioMedicoEmergencia medicoEmergencista;
    FuncionarioMedicoEspecialista medicoEspecialista;
    FuncionarioMedicoGeral medicoGeral;
    FuncionarioEnfermeiro enfermeiro;

    @BeforeEach
    void setUp() {
        medicoEmergencista = new FuncionarioMedicoEmergencia(null);
        medicoEspecialista = new FuncionarioMedicoEspecialista(medicoEmergencista);
        medicoGeral = new FuncionarioMedicoGeral(medicoEspecialista);
        enfermeiro = new FuncionarioEnfermeiro(medicoGeral);
    }

    @Test
    void deveRetornarEnfermeiroParaProntuarioTriagem() {
        assertEquals("Enfermeiro", enfermeiro.assinarProntuario(new Prontuario(TipoProntuarioTriagem.getTipoProntuarioTriagem())));
    }

    @Test
    void deveRetornarMedicoGeralParaProntuarioConsulta() {
        assertEquals("Médico Geral", enfermeiro.assinarProntuario(new Prontuario(TipoProntuarioConsultaGeral.getTipoProntuarioConsultaGeral())));
    }

    @Test
    void deveRetornarMedicoEspecialistaParaProntuarioEspecialista() {
        assertEquals("Médico Especialista", enfermeiro.assinarProntuario(new Prontuario(TipoProntuarioEspecialista.getTipoProntuarioEspecialista())));
    }

    @Test
    void deveRetornarMedicoEmergencistaParaProntuarioEmergencia() {
        assertEquals("Médico Emergencista", enfermeiro.assinarProntuario(new Prontuario(TipoProntuarioEmergencia.getTipoProntuarioEmergencia())));
    }

}