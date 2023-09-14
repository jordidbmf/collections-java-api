package list.Ordenacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class OrdenacaoNumeros {
    //atributos
    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    //Ordena os números da lista em ordem ascendente usando a interface Comparable e a class Collections
    public List<Integer> ordenarAscendente(){
        List<Integer> listaNumeros = new ArrayList<>(this.numeros);
        Collections.sort(listaNumeros);
        return listaNumeros;
    }

    //Ordena os números da lista em ordem descendente usando um Comparable e a class Collections
    public List<Integer> ordenarDescendente(){
        List<Integer> listaNumeros = new ArrayList<>(this.numeros);
        Collections.sort(listaNumeros, Collections.reverseOrder());
        return listaNumeros;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(20);
        ordenacaoNumeros.adicionarNumero(-12);
        ordenacaoNumeros.adicionarNumero(300);

        System.out.println("A ordem dos ascendente dos números é: " + ordenacaoNumeros.ordenarAscendente());
        System.out.println("A ordem dos descendente dos números é: " + ordenacaoNumeros.ordenarDescendente());
    }
    
}
