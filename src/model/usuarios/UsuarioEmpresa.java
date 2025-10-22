package model.usuarios;

import java.time.LocalDate;

public class UsuarioEmpresa extends Usuario {

    private String cnpj;
    private String razao_social;
    private String nome_fantasia;
    private String porte;
    private String endereco;
    private String site;
    private String area_atuacao;
    private int parceiro;

    public UsuarioEmpresa(
            int cidade,
            String email,
            LocalDate data_cadastro,
            String telefone,
            String senha_hash,
            String status,
            String cnpj,
            String razao_social,
            String nome_fantasia,
            String porte,
            String endereco,
            String site,
            String area_atuacao,
            int parceiro
    ) {
        super(cidade, email, data_cadastro, telefone, senha_hash, status);

        this.cnpj = cnpj;
        this.razao_social = razao_social;
        this.nome_fantasia = nome_fantasia;
        this.porte = porte;
        this.endereco = endereco;
        this.site = site;
        this.area_atuacao = area_atuacao;
        this.parceiro = parceiro;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void setArea_atuacao(String area_atuacao) {
        this.area_atuacao = area_atuacao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public String getNome_fantasia() {
        return nome_fantasia;
    }

    public String getPorte() {
        return porte;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getSite() {
        return site;
    }

    public String getArea_atuacao() {
        return area_atuacao;
    }

}
