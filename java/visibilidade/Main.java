package visibilidade;

public class Main {
    static void main() {

    Clientes clientes1 = new Clientes("Marta", 44);


    // COM ENCAPSULAMENTO (PRIVATE)
//    Clientes clientes1 = new Clientes();
//    clientes1.setNome("Marta");
//    clientes1.setIdade(25);

    //SEM ENCAPSULAMENTO
//    Clientes clientes1 = new Clientes();
//    clientes1.nome = "Marta";
//    clientes1.idade = 25;

        //Algorito
//        String nome = "Marta";
//        int idade = 25;

        System.out.println("-------------------------------------------");
        System.out.println("= Clientes =");
        System.out.println("Nome: "+ clientes1.getNome());
        System.out.println("Idade: "+ clientes1.getIdade());
        System.out.println("-------------------------------------------");
//    Funcionarios
        System.out.println("= Funcionarios =");
        Funcionarios funcionarios1 = new Funcionarios("jão",32,"jão2@gmail.com");
//        funcionarios1.setNome("Jão");
//        funcionarios1.setIdade(32);
//        funcionarios1.setEmail("jão2@gmail.com");

        System.out.println("Nome: "+ funcionarios1.getNome());
        System.out.println("Idade: "+ funcionarios1.getIdade());
        System.out.println("Email: "+ funcionarios1.getEmail());
        System.out.println("-------------------------------------");
        System.out.println("= Produto =");
        Produto produto1 = new Produto("miojo",5,7.5);
//        produto1.setNome("miojo");
//        produto1.setQuantidade(5);
//        produto1.setPreco(7.5);
        System.out.println("Nome: "+ produto1.getNome());
        System.out.println("Quantidade: "+ produto1.getQuantidade());
        System.out.println("Preço: "+ produto1.getPreco());
        System.out.println("-------------------------------------");
    }

}
