package med.voll.api.domain.consulta;

import med.voll.api.domain.medico.Medico;
import med.voll.api.domain.paciente.Paciente;

public record DadosListagemConsultas(

        Long id,
        Long idMedico,
        Long idPaciente

) {

    public DadosListagemConsultas(Consulta consulta){
        this(consulta.getId(), consulta.getMedico().getId(), consulta.getPaciente().getId());
    }

}
