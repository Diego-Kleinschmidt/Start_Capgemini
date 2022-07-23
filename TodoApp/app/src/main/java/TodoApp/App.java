
package TodoApp;

import controller.ProjetoControle;
import controller.TarefaControle;
import java.util.Date;
import java.util.List;
import model.Projeto;
import model.Tarefa;
import view.TelaPrincipal;


public class App {


    public static void main(String[] args) {

        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        
//        ProjetoControle controle = new ProjetoControle();
//        Projeto p = new Projeto();
//        p.setNome("testando tarefa");
//        p.setDescricao("nao tem ");
//        controle.salva(p);
//        
//        
//        TarefaControle tarefaControle = new TarefaControle();
//        Tarefa tarefa = new Tarefa();
//        tarefa.setNome("testando");
//        tarefa.setDescricao("testeeee");
//        tarefa.setIdProjeto(2);
//        tarefa.setNota("nao tem notas");
//        tarefa.setConcluida(false);
//        tarefa.setPrazo(new Date());
//        tarefaControle.save(tarefa);
    }
}
