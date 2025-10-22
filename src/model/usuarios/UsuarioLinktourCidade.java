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
public class UsuarioLinktourCidade extends UsuarioLinktour {
    
    public UsuarioLinktourCidade(int registro, int cidade, String email, LocalDate data_cadastro, String telefone, String senha_hash, String status) {
        super(registro, cidade, email, data_cadastro, telefone, senha_hash, status);
    }
    
    
}
