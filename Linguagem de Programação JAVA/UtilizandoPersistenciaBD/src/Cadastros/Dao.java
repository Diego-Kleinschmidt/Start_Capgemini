package Cadastros;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.protocol.Resultset;

public class Dao {

	Connection con; // conexao ao banco
	PreparedStatement stmt; // acessa a tabela
	Resultset rs; // consulta a tabela
	CallableStatement call; // Procerure e function

	public void open() throws Exception {
		String url = "jdbc:mysql://localhost:3306/cadastros?user=root&password=";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			con = DriverManager.getConnection(url);
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Erro ao conectar com o banco");
		}
	}
	
	public void close() throws Exception{
		con.close();
	}

}
