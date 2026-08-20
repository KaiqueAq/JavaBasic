package Biblioteca;


public class Main {
    static void main() {
    Livro livro1 = new Livro("Harry poter", "Alice ", 73,500.99);
    Livro livro2 = new Livro("Diario de um banna", "Mauricio ", 60,200.99);
        System.out.println("Livro 1:");
        System.out.println("Título: "+ livro1.getTitulo());
        System.out.println("Autor: "+ livro1.getAutor());
        System.out.println("Número de páginas: "+ livro1.getNumeropag());
        System.out.println("Preço: R$ "+ livro1.getPreco());
        System.out.println("-----------------------------------");
        System.out.println("Livro 2:");
        System.out.println("Título: "+ livro2.getTitulo());
        System.out.println("Autor: "+ livro2.getAutor());
        System.out.println("Número de páginas: "+ livro2.getNumeropag());
        System.out.println("Preço: R$ "+ livro2.getPreco());

    }

}
