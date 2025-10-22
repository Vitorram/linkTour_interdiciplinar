package app;

import model.usuarios.UsuarioComum;

public class Main {
    public static void main(String[] args) {
        UsuarioComum usuario = new UsuarioComum(
            "Vitor Ramos",
            "Caraguatatuba",
            "vitor@gfamil",
            "129918223",
            "86199",
            "12/08/2000"
        );

        System.out.println(usuario);
    }
}
