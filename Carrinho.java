package app;

import java.util.ArrayList;
import java.util.List;

// Classe Carrinho que gerencia os produtos adicionados ao carrinho de compras
public class Carrinho {

    // Lista que armazena os produtos no carrinho
    private List<Produto> produtos;

    // Construtor do Carrinho, inicializa a lista de produtos
    public Carrinho() {
        produtos = new ArrayList<>();
    }

    // Método para adicionar um produto ao carrinho
    public void adicionarProduto(Produto produto, int quantidade) {

        // Se o produto já estiver no carrinho, atualiza a quantidade
        for (Produto p : produtos) {
            if (p.getNome().equals(produto.getNome())) {
                p.setQuant(p.getQuant() + quantidade);
                return;
            }
        }
        // Caso contrário, adiciona o produto à lista com a quantidade definida
        produto.setQuant(quantidade);
        produtos.add(produto);
    }

    // Método para remover um produto do carrinho pelo nome
    public void removerProduto(String nomeProduto) {
        produtos.removeIf(p -> p.getNome().equals(nomeProduto));
    }

    // Método para atualizar a quantidade de um produto específico no carrinho
    public void atualizarQuantidade(String nomeProduto, int novaQuant) {
        for (Produto p : produtos) {
            if (p.getNome().equals(nomeProduto)) {

                // Se a nova quantidade for maior que zero, atualiza a quantidade
                if (novaQuant > 0) {
                    p.setQuant(novaQuant);
                } else {

                    // Se a quantidade for zero ou menor, remove o produto do carrinho
                    removerProduto(nomeProduto);
                }
                return;
            }
        }
    }

    // Método para calcular o valor total do carrinho
    public double calcularTotal() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.getPrecoTotal();
        }
        return total;
    }

    // Método para retornar a lista de produtos no carrinho
    public List<Produto> getProdutos() {
        return produtos;
    }
}
