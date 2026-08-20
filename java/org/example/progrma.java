package org.example;

public class progrma {
    static void main() {
        String nomeUsuario = "Marta";
        int senha = 159;
        boolean resultadoNome = nomeUsuario.equals("Marta");
        boolean resultaSenha = (senha == 456);
        if (resultadoNome && resultaSenha) {
            System.out.println("Bem-vindo, usuário logado! " + resultadoNome);
        }else {
            System.out.println("Nome de usuário ou senha inválidos  " + resultaSenha);
        }
    }
}
