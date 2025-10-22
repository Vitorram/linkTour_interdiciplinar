package model.user;

public class UsuarioComum extends Usuario {
    private String cpf;
    private String datNasc;

    public UsuarioComum(String nome, String cidade, String email, String telefone, String cpf, String datNasc) {
        super(nome, cidade, email, telefone);
        this.cpf = cpf;
        this.datNasc = datNasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDatNasc() {
        return datNasc;
    }

    public void setDatNasc(String datNasc) {
        this.datNasc = datNasc;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\n" +
               "Cidade: " + getCidade() + "\n" +
               "Email: " + getEmail() + "\n" +
               "Telefone: " + getTelefone() + "\n" +
               "CPF: " + cpf + "\n" +
               "Data de Nascimento: " + datNasc;
    }
}
