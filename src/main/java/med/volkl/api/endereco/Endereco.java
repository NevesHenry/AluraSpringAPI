package med.volkl.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.volkl.api.medico.DadosAtualizacaoMedico;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco(DadosEndereco dados) {
        this.logradouro = dados.logradouro();
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.uf = dados.uf();
        this.cidade = dados.cidade();
        this.numero = dados.numero();
    }

    public void atualizarInformacoes(DadosAtualizacaoMedico dados) {
        if(dados.endereco().logradouro() != null){
            this.logradouro = dados.endereco().logradouro();
        }
        if(dados.endereco().bairro() != null){
            this.bairro = dados.endereco().bairro();
        }
        if(dados.endereco().cep() != null){
            this.cep = dados.endereco().cep();
        }
        if(dados.endereco().uf() != null){
            this.uf = dados.endereco().uf();
        }
        if(dados.endereco().cidade() != null){
            this.cidade = dados.endereco().cidade();
        }
        if(dados.endereco().numero() != null){
            this.numero = dados.endereco().numero();
        }
        if(dados.endereco().complemento() != null){
            this.complemento = dados.endereco().complemento();
        }
    }
}
