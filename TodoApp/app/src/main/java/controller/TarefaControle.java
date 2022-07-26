package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Tarefa;
import util.ConexaoBanco;

public class TarefaControle {

    public void save(Tarefa tarefa) {
        String sql = "INSERT INTO tarefas (idProjeto, nome, descricao, concluida, nota,"
                + " prazo, dataCriacao, dataAtualizacao) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            // Crianção da conexão com o banco de dados 
            connection = ConexaoBanco.getConnection();
            //preparando a query 
            statement = connection.prepareStatement(sql);
            // Setando os valores
            statement.setInt(1, tarefa.getIdProjeto());
            statement.setString(2, tarefa.getNome());
            statement.setString(3, tarefa.getDescricao());
            statement.setBoolean(4, tarefa.isConcluida());
            statement.setString(5, tarefa.getNota());
            statement.setDate(6, new Date(tarefa.getPrazo().getTime()));
            statement.setDate(7, new Date(tarefa.getDataCriacao().getTime()));
            statement.setDate(8, new Date(tarefa.getDataAtualizacao().getTime()));
            // Executando a query
            statement.execute();

        } catch (Exception ex) {
            throw new RuntimeException("Erro ao salvar a terefa " + ex.getMessage(), ex);

        } finally {
            ConexaoBanco.closeConnection(connection, statement);
        }
    }

    public void update(Tarefa tarefa) {
        String sql = "UPDATE tarefas SET idProjeto = ?, nome = ?, descricao = ?, concluida = ?, nota = ?, "
                + "prazo = ?, dataCriacao = ?, dataAtualizacao = ? WHERE id = ? ";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            // Crianção da conexão com o banco de dados 
            connection = ConexaoBanco.getConnection();
            //preparando a query 
            statement = connection.prepareStatement(sql);
            // Setando os valores
            statement.setInt(1, tarefa.getIdProjeto());
            statement.setString(2, tarefa.getNome());
            statement.setString(3, tarefa.getDescricao());
            statement.setBoolean(4, tarefa.isConcluida());
            statement.setString(5, tarefa.getNota());
            statement.setDate(6, new Date(tarefa.getPrazo().getTime()));
            statement.setDate(7, new Date(tarefa.getDataCriacao().getTime()));
            statement.setDate(8, new Date(tarefa.getDataAtualizacao().getTime()));
            statement.setInt(9, tarefa.getId());
            // Executando a query
            statement.execute();

        } catch (Exception ex) {
            throw new RuntimeException("Erro ao atualizar a terefa " + ex.getMessage(), ex);

        } finally {
            ConexaoBanco.closeConnection(connection, statement);
        }
    }

    public void removeById(int tarefaId)  {
        String sql = "DELETE FROM tarefas WHERE id = ?";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            // Crianção da conexão com o banco de dados 
            connection = ConexaoBanco.getConnection();
            //preparando a query 
            statement = connection.prepareStatement(sql);
            // Setando os valores
            statement.setInt(1, tarefaId);
            // Executando a query
            statement.execute();

        } catch (Exception ex) {
            throw new RuntimeException("Erro ao deletar a tarefa" + ex.getMessage(), ex);

        } finally {
            ConexaoBanco.closeConnection(connection, statement);
        }
    }

    public List<Tarefa> getAll(int idProjeto) {
        String sql = "SELECT * FROM tarefas WHERE idProjeto = ?";

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        // Lista de tarefas que sera devolvida quando chamar o metodo
        List<Tarefa> tarefas = new ArrayList<>();

        try {
            // Crianção da conexão com o banco de dados 
            connection = ConexaoBanco.getConnection();
            //preparando a query 
            statement = connection.prepareStatement(sql);
            // Setando o valor que corresponde ao filtro de busca
            statement.setInt(1, idProjeto);
            // Valor retornado pela execuçaõ da query
            resultSet = statement.executeQuery();

            //Enquanto houverem valores a serem percoridos no resultSet 
            while (resultSet.next()) {

                Tarefa tarefa = new Tarefa();
                tarefa.setId(resultSet.getInt("id"));
                tarefa.setIdProjeto(resultSet.getInt("idProjeto"));
                tarefa.setNome(resultSet.getString("nome"));
                tarefa.setDescricao(resultSet.getString("descricao"));
                tarefa.setConcluida(resultSet.getBoolean("concluida"));
                tarefa.setNota(resultSet.getString("nota"));
                tarefa.setPrazo(resultSet.getDate("prazo"));
                tarefa.setDataCriacao(resultSet.getDate("dataCriacao"));
                tarefa.setDataAtualizacao(resultSet.getDate("dataAtualizacao"));

                tarefas.add(tarefa);
            }
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao retornar a tarefa" + ex.getMessage(), ex);

        } finally {
            ConexaoBanco.closeConnection(connection, statement, resultSet);
        }
        // lista de tarefas que foi criada e carregada pelo banco de dados
        return tarefas;
    }
}
