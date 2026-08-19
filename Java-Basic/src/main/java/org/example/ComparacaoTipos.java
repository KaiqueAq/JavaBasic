package org.example;

public class ComparacaoTipos {
    static void main() {
        String nomeUsuario = "Marta";
        int senha = 123;
        boolean resultadoNome = nomeUsuario.equals("Marta");
        boolean resultaSenha = (senha == 456);

        System.out.println("O nome do usuário está correto? "+ resultadoNome);
        System.out.println("A senha está correta? " + resultaSenha );
    }
}
