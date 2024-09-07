package app;

import java.util.Scanner;

// Classe principal que executa o sistema da loja online
public class SistemaLoja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lista de produtos disponíveis na loja
        Produto[] produtosDisponiveis = {
                new Produto("Camisa", 50.0),
                new Produto("Calça", 80.0),
                new Produto("Tênis", 120.0),
                new Produto("Boné", 30.0),
                new Produto("Relógio", 150.0),
                new Produto("Bolsa", 200.0),
                new Produto("Cinto", 40.0),
                new Produto("Óculos", 180.0),
                new Produto("Jaqueta", 250.0),
                new Produto("Meia", 20.0)
        };

        // Saudação inicial e solicitação do nome do cliente
        System.out.println("Bem-vindo à loja online!");
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        // Criação do cliente e seu respectivo carrinho
        Cliente cliente = new Cliente(nomeCliente);
        Carrinho carrinho = cliente.getCarrinho();

        boolean continuar = true;

        // Laço principal para interação com o sistema de compras
        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar produto ao carrinho");
            System.out.println("2. Remover produto do carrinho");
            System.out.println("3. Atualizar quantidade no carrinho");
            System.out.println("4. Ver total do carrinho");
            System.out.println("5. Finalizar compra");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();

            // Limpa o buffer após a leitura do inteiro
            scanner.nextLine();

            switch (opcao) {

                // Exibe os produtos disponíveis e permite a escolha
                case 1:
                    System.out.println("\nProdutos disponíveis:");
                    for (int i = 0; i < produtosDisponiveis.length; i++) {
                        System.out.println((i + 1) + ". " + produtosDisponiveis[i].getNome() + " - R$ " + produtosDisponiveis[i].getPreco());
                    }
                    System.out.print("Selecione o número do produto que deseja adicionar: ");
                    int escolhaProduto = scanner.nextInt();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();

                    // Verifica se o produto selecionado é válido e o adiciona ao carrinho
                    if (escolhaProduto >= 1 && escolhaProduto <= produtosDisponiveis.length) {
                        Produto produtoSelecionado = produtosDisponiveis[escolhaProduto - 1];
                        carrinho.adicionarProduto(produtoSelecionado, quantidade);
                        System.out.println("Produto adicionado ao carrinho!");
                    } else {
                        System.out.println("Produto inválido!");
                    }
                    break;

                // Permite remover um produto do carrinho pelo nome
                case 2:
                    System.out.print("Digite o nome do produto a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    carrinho.removerProduto(nomeRemover);
                    System.out.println("Produto removido do carrinho!");
                    break;

                // Permite atualizar a quantidade de um produto no carrinho
                case 3:
                    System.out.print("Digite o nome do produto para atualizar: ");
                    String nomeAtualizar = scanner.nextLine();
                    System.out.print("Nova quantidade: ");
                    int novaQuantidade = scanner.nextInt();
                    carrinho.atualizarQuantidade(nomeAtualizar, novaQuantidade);
                    System.out.println("Quantidade atualizada!");
                    break;

                // Exibe os produtos no carrinho e o total a ser pago
                case 4:
                    System.out.println("Carrinho do cliente " + cliente.getNome() + ":");
                    for (Produto p : carrinho.getProdutos()) {
                        System.out.println(p);
                    }
                    System.out.println("Total a pagar: R$ " + carrinho.calcularTotal());
                    break;

                // Finaliza a compra e exibe o resumo dos produtos e o total
                case 5:
                    System.out.println("Compra finalizada!");
                    System.out.println("Cliente: " + cliente.getNome());
                    System.out.println("Produtos no carrinho:");
                    for (Produto p : carrinho.getProdutos()) {
                        System.out.println(p);
                    }
                    System.out.println("Total final: R$ " + carrinho.calcularTotal());
                    continuar = false;
                    break;

                // Mensagem de erro caso o cliente escolha uma opção inválida
                default:
                    System.out.println("Opção inválida!");
            }
        }
        // Fecha o scanner após o término da execução
        scanner.close();
    }
}