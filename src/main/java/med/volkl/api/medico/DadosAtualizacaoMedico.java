package med.volkl.api.medico;

import jakarta.validation.constraints.NotNull;
import med.volkl.api.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        DadosEndereco endereco) {
}
