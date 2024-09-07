# loja-online
Sistema que simula uma loja online onde o cliente pode adicionar produtos ao carrinho.
foi utilizado a IDE Intellij; sistema feito com muito esforço, pois se trata de algo "complexo" para iniciantes, abaixo foi feito um breve detalhamento de como funciona o codigo e suas relações relatorio feito enquanto era desenvolvido o codigo java; obrigado por vir ao meu gitHub - wagner alves 07/09/24

inicio do codigo: 05/09/2024 termino do codigo: 07/09/2024 as 11:06 da manhã

Classe Produto
Descrição: Representa um item que pode ser adicionado ao carrinho de compras.
Funcionamento:

Atributos:
nome: Nome do produto.
preco: Preço unitário do produto.
quant: Quantidade do produto.
Construtor: Inicializa o nome e o preço do produto, e define a quantidade inicial como 0.
Métodos:
getNome(), setNome(String nome): Métodos para acessar e modificar o nome do produto.
getPreco(), setPreco(double preco): Métodos para acessar e modificar o preço do produto.
getQuant(), setQuant(int quant): Métodos para acessar e modificar a quantidade do produto.
getPrecoTotal(): Calcula o preço total do produto com base na quantidade (preco * quant).
toString(): Fornece uma representação textual do produto, útil para exibição.
Uso: A classe Produto define os produtos disponíveis na loja e suas características.

Classe Carrinho
Descrição: Gerencia a lista de produtos que um cliente adiciona ao seu carrinho de compras.

Funcionamento:

Atributos:
produtos: Lista que armazena os produtos no carrinho.
Construtor: Inicializa a lista de produtos como uma nova lista vazia.
Métodos:
adicionarProduto(Produto produto, int quantidade): Adiciona um produto ao carrinho. Se o produto já estiver no carrinho, atualiza a quantidade. Caso contrário, adiciona o produto com a quantidade especificada.
removerProduto(String nomeProduto): Remove um produto do carrinho com base no nome.
atualizarQuantidade(String nomeProduto, int novaQuant): Atualiza a quantidade de um produto específico. Se a nova quantidade for zero ou negativa, remove o produto do carrinho.
calcularTotal(): Calcula o valor total do carrinho somando o preço total de cada produto.
getProdutos(): Retorna a lista de produtos no carrinho.
Uso: A classe Carrinho mantém a lista de produtos que um cliente deseja comprar e permite a modificação dessa lista.

Classe Cliente
Descrição: Representa um cliente da loja e seu carrinho de compras.

Funcionamento:

Atributos:
nome: Nome do cliente.
carrinho: Instância da classe Carrinho associada ao cliente.
Construtor: Inicializa o nome do cliente e cria um novo carrinho para o cliente.
Métodos:
getNome(): Retorna o nome do cliente.
getCarrinho(): Retorna o carrinho associado ao cliente.
Uso: A classe Cliente associa um carrinho de compras a cada cliente e fornece métodos para acessar o nome e o carrinho.

Classe SistemaLoja
Descrição: Classe principal que gerencia a interação com o usuário e controla o fluxo do sistema de loja online.

Funcionamento:

Objetivo: Fornece um menu de opções para o cliente, permitindo adicionar, remover e atualizar produtos no carrinho, verificar o total e finalizar a compra.
Métodos:
main(String[] args): Método principal que executa o sistema. Contém a lógica para:
Exibir um menu de opções para o cliente.
Adicionar produtos ao carrinho.
Remover produtos do carrinho.
Atualizar a quantidade de produtos no carrinho.
Exibir o total do carrinho e finalizar a compra.
Uso: A classe SistemaLoja é a interface com o usuário e coordena as operações entre o cliente e o carrinho. Ela cria e manipula instâncias das outras classes e gerencia o fluxo da aplicação.

Relação entre as Classes
Produto: Define o que é um produto e como calcular o preço total baseado na quantidade.
Carrinho: Gerencia uma coleção de Produto e realiza operações como adicionar, remover e atualizar produtos, além de calcular o total.
Cliente: Possui um Carrinho e fornece métodos para acessar seu nome e seu carrinho.
SistemaLoja: Interage com o usuário para manipular um Cliente e seu Carrinho, e utiliza a classe Produto para exibir opções e realizar operações baseadas nas escolhas do usuário.
