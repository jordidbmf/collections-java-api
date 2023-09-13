package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for(Integer n : numeros){
                soma += n;
        }
        return soma;
    } 

    public Integer encontraMaiorNumero(){
        Integer maiorNumero = numeros.get(0);
        if(!numeros.isEmpty()){            
            for(Integer n : numeros){
                if(n > maiorNumero){
                    maiorNumero = n;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("A lista de números está vazia!");
        }
    }

    public int encontraMenorNumero(){
        Integer menorNumero = numeros.get(0);
        if(!numeros.isEmpty()){            
            for(Integer n : numeros){
                if(n < menorNumero){
                    menorNumero = n;
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("A lista de números está vazia!");
        }
    }

    public void exibirNumeros(){
        if(!numeros.isEmpty()){
            System.out.println(this.numeros);
        }else{
            System.out.println("A lista de números está vazia!");
        }
    }

    
    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        //Exibindo números:
        somaNumeros.exibirNumeros();

        //Somando números:
        System.out.println("A soma dos números é = " + somaNumeros.calcularSoma());
        
        //Maior número:
        System.out.println("O maior número é: " + somaNumeros.encontraMaiorNumero());

        //Menor número:
        System.out.println("O menor número é: " + somaNumeros.encontraMenorNumero());
    }

    
}
