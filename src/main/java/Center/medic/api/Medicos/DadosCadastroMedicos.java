package Center.medic.api.Medicos;

import Center.medic.api.Enderecos.DadosEndereco;

public record DadosCadastroMedicos(String nome, String email, String crm, Especialidade especialidade,DadosEndereco endereco) {

}
