package app;

//classe produto representa um item que pode ser adicionado ao carrinho
public class Produto {
    private String nome;
    private double preco;
    private int quant;

    // Construtor da classe Produto, inicializa o nome, preço e quantidade
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quant = 0; // Quantidade inicial
    }

    // Métodos getters e setters para acessar e modificar os atributos do carrinho
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    // Método que calcula o preço total com base na quantidade de produtos
    public double getPrecoTotal() {
        return preco * quant;
    }

    // Método toString que retorna a descrição do produto para fácil leitura
    @Override
    public String toString() {
        return nome + " (preço: R$ " + preco + ", Quantidade: " + quant + ")";
    }
}
