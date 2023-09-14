package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {
    private Set<Tarefa> listaTarefa;

    public ListaTarefa() {
        this.listaTarefa = new HashSet<>();
    }

    //Adiciona uma nova tarefa ao Set
    public void adicionarTarefa(String descricao){
        listaTarefa.add(new Tarefa(descricao));
    }

    //Remove uma tarefa do Set de acordo com a descrição, se estiver presente
    public void removerTarefa(String descricao){
        Tarefa tarefaParaExcluir = null;
        if(!listaTarefa.isEmpty()){
            for(Tarefa t : listaTarefa){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaParaExcluir = t;
                    break;
                }            
            }
            listaTarefa.remove(tarefaParaExcluir);
        } else {
            System.out.println("Lista de tarefas vazia!");
        }

        if(tarefaParaExcluir == null){
            System.out.println("Tarefa não encontrada!");
        }
    }

    //Exibe todas as tarefas da lista de tarefas
    public void exibirTarefas(){
        if(!listaTarefa.isEmpty()){
            System.out.println("Lista de tarefas: " + listaTarefa);
        } else {
            System.out.println("Tarefa não encontrada!");
        }
    }

    //Conta o número total de tarefas na lista de tarefas
    public int contarTarefas(){
        return listaTarefa.size();
    }

    //Retorna um Set com as tarefas concluídas
    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa t : listaTarefa){
            if(t.isTarefaConcluida()){
                tarefasConcluidas.add(t);
            } 
        }
        return tarefasConcluidas;
    }

    //Retorna um Set com as tarefas pendentes
    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa t : listaTarefa){
            if(!t.isTarefaConcluida()){
                tarefasPendentes.add(t);
            } 
        }
        return tarefasPendentes;
    }

    //Marca uma tarefa como concluída de acordo com a descrição
    public void marcarTarefaConcluida(String descricao){
        for(Tarefa t : listaTarefa){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setTarefaConcluida(true);
            }
        }
    }

    //Marca uma tarefa como pendente de acordo com a descrição
    public void marcarTarefaPendente(String descricao){
        Tarefa tarefaParaMarcarComoPendente = null;
        for(Tarefa t : listaTarefa){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaMarcarComoPendente = t;
                break;
            }
        }

        if(tarefaParaMarcarComoPendente != null){
            if(tarefaParaMarcarComoPendente.isTarefaConcluida()){
                tarefaParaMarcarComoPendente.setTarefaConcluida(false);
            }
        } else {
            System.out.println("Tarefa não encontrada na lista.");
        }
    }

    //Remove todas as tarefas da lista de tarefas
    public void limparListaTarefas(){
        if(listaTarefa.isEmpty()){
            System.out.println("A lista de tarefas já está vazia!");
        } else {
            listaTarefa.clear();
        }
    }

    public static void main(String[] args) {
        //Instanciando ListaTarefa
        ListaTarefa listaTarefa = new ListaTarefa();

        //Adicionando tarefas na lista
        listaTarefa.adicionarTarefa("Estudar");
        listaTarefa.adicionarTarefa("Ler livro");
        listaTarefa.adicionarTarefa("Se exercitar");
        listaTarefa.adicionarTarefa("Limpar a casa");
        listaTarefa.adicionarTarefa("Comer");

        //Exibindo as terefas da lista
        //listaTarefa.exibirTarefas();

        // //Removando uma tarefa
        // listaTarefa.removerTarefa("Comer");
        // listaTarefa.exibirTarefas();

        // //Contando o número de tarefas na lista
        // System.out.println("Total de tarefas na lista: " + listaTarefa.contarTarefas());

        //Marcando tarefas como concluídas
        listaTarefa.marcarTarefaConcluida("Estudar"); 
        listaTarefa.marcarTarefaConcluida("Ler livro"); 

        //Obtendo tarefas concluídas
        System.out.println(listaTarefa.obterTarefasConcluidas());

        //Marcando tarefas como pendetes
        listaTarefa.marcarTarefaPendente("Estudar");
        listaTarefa.exibirTarefas();

        //Obtendo tarefas pendentes        
        System.out.println(listaTarefa.obterTarefasPendentes());

        //Limpando a lista de tarefas
        listaTarefa.limparListaTarefas();
        listaTarefa.exibirTarefas();
    }

}

