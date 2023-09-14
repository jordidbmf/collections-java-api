package set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    //Adiciona uma palavra ao conjunto
    public void adicionarPalavra(String palavra){
        palavrasUnicas.add(palavra);
    }

    //Remove uma palavra do conjunto
    public void removerPalavra(String palavra){
        if(!palavrasUnicas.isEmpty()){
            if(palavrasUnicas.contains(palavra)){
                palavrasUnicas.remove(palavra);
            } else {
                System.out.println("A palavra não está presente no conjunto!");
            }
        } else {
            System.out.println("O conjunto de palavras está vazio!");
        }
    }

    //Verifica se uma palavra está presente no conjunto
    public boolean verificarPalavra(String palavra){
        return palavrasUnicas.contains(palavra);
    }

    //Exibe todas as palavras únicas do conjunto
    public void exibirPalavrasUnicas(){
        if(!palavrasUnicas.isEmpty()){
            System.out.println("Palavras do conjunto: " + palavrasUnicas);
        } else {
            System.out.println("O conjunto de palavras está vazio!");
        }
        
    }


    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        //Adicionar palavras:
        conjuntoPalavrasUnicas.adicionarPalavra("Batata");
        conjuntoPalavrasUnicas.adicionarPalavra("Estudar");
        conjuntoPalavrasUnicas.adicionarPalavra("Livro");
        conjuntoPalavrasUnicas.adicionarPalavra("Mesa");

        //Exibir palavras:
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        //Remover palavra:
        //conjuntoPalavrasUnicas.removerPalavra("Lousa");
        //conjuntoPalavrasUnicas.removerPalavra("Livro");

        //conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        //Verificar palavra:
        System.out.println("A palavra 'Mesa' está no conjunto? " + conjuntoPalavrasUnicas.verificarPalavra("Mesa"));
        
        System.out.println("A palavra 'Bola' está no conjunto? " + conjuntoPalavrasUnicas.verificarPalavra("Bola"));
    }
}
