package model.usuarios;

import java.time.LocalDate;

public class UsuarioComum extends Usuario {

    private String cpf;
    private String nome_completo;
    private String preferencias;
    private LocalDate nascimento;
    private String genero;
    private int parceiro; 

    public UsuarioComum(String cpf, String nome_completo, String preferencias, LocalDate nascimento, String genero, int parceiro, int cidade, String email, LocalDate data_cadastro, String telefone, String senha_hash, String status) {
        super(cidade, email, data_cadastro, telefone, senha_hash, status);
        this.cpf = cpf;
        this.nome_completo = nome_completo;
        this.preferencias = preferencias;
        this.nascimento = nascimento;
        this.genero = genero;
        this.parceiro = parceiro;
    }

   
    public String getCpf() {
        return cpf;
    }

    public String getNome_completo() {
        return nome_completo;
    }

    public String getPreferencias() {
        return preferencias;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public void setPreferencias(String preferencias) {
        this.preferencias = preferencias;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    

}
