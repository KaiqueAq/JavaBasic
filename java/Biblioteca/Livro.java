package Biblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private int numeropag;
    private double preco;


    public Livro(String titulo, String autor, int numeropag, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeropag = numeropag;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeropag() {
        return numeropag;
    }

    public void setNumeropag(int numeropag) {
        this.numeropag = numeropag;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
