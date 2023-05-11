package med.volkl.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.volkl.api.endereco.*;


public record DadosCadastroMedico(
        @NotBlank
        String nome,

        @NotBlank @Email
        String email,

        @NotBlank @Pattern(regexp = "\\d{4,6}")
        String crm,

        @NotNull
        Especialidade especialidade,

        @Valid @NotNull
        DadosEndereco endereco ){
}
