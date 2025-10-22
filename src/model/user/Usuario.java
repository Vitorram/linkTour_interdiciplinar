package model.user;

public class Usuario{
    private String nome;
    private String cidade;
    private String email;
    private String telefone;

    public Usuario(String nome, String cidade, String email, String telefone) {
        this.nome = nome;
        this.cidade = cidade;
        this.email = email;
        this.telefone = telefone;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
