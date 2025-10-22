package model.usuarios;

import java.time.LocalDate;

public class Usuario{
    private int cidade;
    private String email;
    private LocalDate data_cadastro;
    private String telefone;
    private String senha_hash;
    private String status;
    private float avg_avaliacao;
    private LocalDate ultimo_login;

    public Usuario(int cidade, String email, LocalDate data_cadastro, String telefone, String senha_hash, String status) {
        this.cidade = cidade;
        this.email = email;
        this.data_cadastro = data_cadastro;
        this.telefone = telefone;
        this.senha_hash = senha_hash;
        this.status = status;
    }

    public int getCidade() {
        return cidade;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getData_cadastro() {
        return data_cadastro;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getSenha_hash() {
        return senha_hash;
    }

    public String getStatus() {
        return status;
    }

    public float getAvg_avaliacao() {
        return avg_avaliacao;
    }

    public LocalDate getUltimo_login() {
        return ultimo_login;
    }

    public void setCidade(int cidade) {
        this.cidade = cidade;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setData_cadastro(LocalDate data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setSenha_hash(String senha_hash) {
        this.senha_hash = senha_hash;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAvg_avaliacao(float avg_avaliacao) {
        this.avg_avaliacao = avg_avaliacao;
    }

    public void setUltimo_login(LocalDate ultimo_login) {
        this.ultimo_login = ultimo_login;
    }
    

}
