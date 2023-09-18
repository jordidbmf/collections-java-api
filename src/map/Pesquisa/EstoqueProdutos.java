package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //atributo
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;       
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                if(p.getPreco() < menorPreco){
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisBarato;       
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoqu = 0d;
        if(!estoqueProdutosMap.isEmpty()){
            for(Map.Entry<Long, Produto> entry: estoqueProdutosMap.entrySet()){
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if(valorProdutoEmEstoque > maiorValorTotalProdutoEstoqu){
                    maiorValorTotalProdutoEstoqu = valorProdutoEmEstoque;
                    produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
                }
            }
        }
        return produtoMaiorQuantidadeValorNoEstoque;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.exibirProdutos();

        estoqueProdutos.adicionarProduto(1L, "Produto A", 10, 5.0);
        estoqueProdutos.adicionarProduto(2L, "Produto B", 5, 10.0);
        estoqueProdutos.adicionarProduto(3L, "Produto C", 2, 15.0);
        estoqueProdutos.adicionarProduto(3L, "Produto D", 2, 20.0);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total de enstoque: R$ " + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais barato: " + estoqueProdutos.obterProdutoMaisBarato());
        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());
    }
}
