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
public class UsuarioLinktour extends Usuario {
    private int registro;

    public UsuarioLinktour(int registro, int cidade, String email, LocalDate data_cadastro, String telefone, String senha_hash, String status) {
        super(cidade, email, data_cadastro, telefone, senha_hash, status);
        this.registro = registro;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }
    
    
    
}
