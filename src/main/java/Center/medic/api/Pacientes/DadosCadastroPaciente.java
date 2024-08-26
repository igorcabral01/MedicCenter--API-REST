package Center.medic.api.Pacientes;

import Center.medic.api.Enderecos.DadosEndereco;

public record DadosCadastroPaciente(
    String nome,
    String email,
    String telefone,
    String cpf,
    DadosEndereco endereco
) {

}
