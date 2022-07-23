package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Projeto;
import util.ConexaoBanco;

public class ProjetoControle {

    public void salva(Projeto projeto) {

        String sql = "INSERT INTO projetos (nome, descricao, dataCriacao, dataAtualizacao) VALUES (?, ?, ?, ?)";

        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = ConexaoBanco.getConnection();
            statement = connection.prepareStatement(sql);
            
            statement.setString(1, projeto.getNome());
            statement.setString(2, projeto.getDescricao());
            statement.setDate(3, new java.sql.Date(projeto.getDataCriacao().getTime()));
            statement.setDate(4, new java.sql.Date(projeto.getDataAtualizacao().getTime()));
            statement.execute();
            
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao salvar o projeto " + ex.getMessage(), ex);
        }finally{
            ConexaoBanco.closeConnection((com.mysql.jdbc.Connection) connection, statement);
        }
    }

    public void update(Projeto projeto) {
        String sql = "UPDATE projetos SET nome = ?, descricao = ?, dataCriacao = ?, dataAtualizacao = ? WHERE id = ? ";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = ConexaoBanco.getConnection();
            statement = connection.prepareStatement(sql);
            
            statement.setString(1, projeto.getNome());
            statement.setString(2, projeto.getDescricao());
            statement.setDate(3, new Date(projeto.getDataCriacao().getTime()));
            statement.setDate(4, new Date(projeto.getDataAtualizacao().getTime()));
            statement.setInt(5, projeto.getId());
            statement.execute();
            
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao atualizar o projeto" + ex.getMessage(), ex);
        }finally{
            ConexaoBanco.closeConnection(connection, statement);
        }
    }

    public void removeById(int id) {
        String sql = "DELETE FROM projetos WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = ConexaoBanco.getConnection();
            statement = connection.prepareStatement(sql);
            
            statement.setInt(1, id);
            statement.execute();
            
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao remover projeto " + ex.getMessage(), ex );
        }finally {
            ConexaoBanco.closeConnection(connection, statement);
        }
    }

    public List<Projeto> getAll() {
        String sql = "SELECT * FROM projetos ";
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Projeto> projetos = new ArrayList<>();
        
        try {
            connection = ConexaoBanco.getConnection();
            statement = connection.prepareStatement(sql);
            
            resultSet = statement.executeQuery();
                    
            while (resultSet.next()) {
             
                Projeto projeto = new Projeto();
                projeto.setId(resultSet.getInt("id"));
                projeto.setNome(resultSet.getString("nome"));
                projeto.setDescricao(resultSet.getString("descricao"));
                projeto.setDataCriacao(resultSet.getDate("dataCriacao"));
                projeto.setDataAtualizacao(resultSet.getDate("dataAtualizacao"));
                
                projetos.add(projeto);
            }
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao retornar o projeto " + ex.getMessage(), ex);
        }finally{
            ConexaoBanco.closeConnection(connection, statement, resultSet);
        }
        return projetos;
    }
}
