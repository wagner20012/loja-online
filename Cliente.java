package app;

// Classe Cliente que representa o comprador, possui o nome e o carrinho de compras
public class Cliente {
    private String nome;
    private Carrinho carrinho;

    // Construtor da classe Cliente, inicializa o nome e o carrinho
    public Cliente(String nome) {
        this.nome = nome;
        this.carrinho = new Carrinho();
    }

    // Métodos getters para acessar o nome e o carrinho do cliente
    public String getNome() {
        return nome;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }
}
