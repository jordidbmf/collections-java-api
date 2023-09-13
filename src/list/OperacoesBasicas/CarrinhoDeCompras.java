package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaItens;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    } 

    public void adicionarItem(String nome, double preco, int quantidade){
        listaItens.add(new Item(nome, preco, quantidade));}

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        if(!listaItens.isEmpty()){
            for(Item i : listaItens){
                if(i.getNome().equalsIgnoreCase(nome)){
                    itensParaRemover.add(i);
                }
            }
            listaItens.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");;
        }
        
        
    }

    public double calcularValorTotal(){
        Double valorTotal = 0d;
        if(!listaItens.isEmpty()){
            for(Item item : listaItens){
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens(){
        System.out.println(listaItens);
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras [listaItens=" + listaItens + "]";
    }
    
    public static void main(String[] args) {
        
        CarrinhoDeCompras listaDeItens = new CarrinhoDeCompras();
        //listaDeItens.exibirItens();

        listaDeItens.adicionarItem("Batata", 5.99, 6);
        listaDeItens.adicionarItem("Couve", 10.0, 1);
        listaDeItens.adicionarItem("Iogurte", 12.90, 2);

        listaDeItens.exibirItens();

        listaDeItens.removerItem("Couve");
        // listaDeItens.exibirItens();

        System.out.println("O valor total de compra é: " + listaDeItens.calcularValorTotal());


    }
}
