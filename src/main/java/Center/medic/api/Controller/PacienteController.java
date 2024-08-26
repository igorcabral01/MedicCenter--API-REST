package Center.medic.api.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Center.medic.api.Pacientes.DadosCadastroPaciente;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    public void CadastroPacientes(@RequestBody DadosCadastroPaciente dados){
        System.out.println("Dados Do Paciente " + dados);
    }

}
