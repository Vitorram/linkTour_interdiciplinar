/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.usuarios;

import java.time.LocalDate;

/**
 *
 * @author luskahz
 */
public class UsuarioLinktourModerador extends UsuarioLinktour {
    private String cpf;
    private String funcao;
    private String nivel_acesso;

    public UsuarioLinktourModerador(String cpf, String funcao, String nivel_acesso, int registro, int cidade, String email, LocalDate data_cadastro, String telefone, String senha_hash, String status) {
        super(registro, cidade, email, data_cadastro, telefone, senha_hash, status);
        this.cpf = cpf;
        this.funcao = funcao;
        this.nivel_acesso = nivel_acesso;
    }

    public String getCpf() {
        return cpf;
    }

    public String getFuncao() {
        return funcao;
    }

    public String getNivel_acesso() {
        return nivel_acesso;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void setNivel_acesso(String nivel_acesso) {
        this.nivel_acesso = nivel_acesso;
    }
    
}
