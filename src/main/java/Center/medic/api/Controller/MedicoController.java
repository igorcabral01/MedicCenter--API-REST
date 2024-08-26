package Center.medic.api.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Center.medic.api.Medicos.DadosCadastroMedicos;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @PostMapping
    public void cadastroMedicos(@RequestBody  DadosCadastroMedicos dados){
        
        System.out.println(dados);
    }

}
