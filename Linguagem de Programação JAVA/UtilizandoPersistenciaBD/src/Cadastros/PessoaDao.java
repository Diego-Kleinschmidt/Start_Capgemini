package Cadastros;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.x.protobuf.MysqlxConnection.Close;
import com.mysql.cj.x.protobuf.MysqlxSql.StmtExecute;

public class PessoaDao extends Dao {

	public void incluirPessoa(Pessoa p) throws Exception {
		open();
		stmt = con.prepareStatement("insert into pessoa (nome_pessoa, email) values (?, ?)");
		stmt.setString(1, p.getNomePessoa());
		stmt.setString(2, p.getEmail());
		stmt.execute();
		stmt.close();
		close();
	}

	public void alteraPesoa(Pessoa p) throws Exception {
		open();
		stmt = con.prepareStatement("update pessoa set nome_pessoa = ?, email = ? where id_pessoa = ?");
		stmt.setString(1, p.getNomePessoa());
		stmt.setString(2, p.getEmail());
		stmt.setInt(3, p.getIdPessoa());
		stmt.execute();
		stmt.close();
		close();
	}

	public void excluirPessoa(Pessoa p) throws Exception {
		open();
		stmt = con.prepareStatement("delete from pessoa where id_pessoa = ?");
		stmt.setInt(1, p.getIdPessoa());
		if (JOptionPane.showConfirmDialog(null, "Voce realmente deseja excluir " + p.getNomePessoa() + " sera definitivo ") == 0) {
			stmt.execute();
		}
		stmt.close();
		close();
	}

	public Pessoa consultaPessoaIndividual(int cod) throws Exception {
		open();
		stmt = con.prepareStatement("select * from pessoa where id_pessoa = ?");
		stmt.setInt(1, cod);
		rs = (Resultset) stmt.executeQuery();
		Pessoa p = null;
		if (((ResultSet) rs).next()) {
			p = new Pessoa();
			p.setIdPessoa(((ResultSet) rs).getInt("id_pessoa"));
			p.setNomePessoa(((ResultSet) rs).getString("nome_pessoa"));
			p.setEmail(((ResultSet) rs).getString("email"));
		} else {
			System.out.println("Registro não encontrado");
		}
		close();
		return p;
	}

	public List<Pessoa> ListarPessoa() {
		try {
			open();
			stmt = con.prepareStatement("select * from pessoa");
			rs = (Resultset) stmt.executeQuery();
			List<Pessoa> listaPessoas = new ArrayList<>();
			while (((ResultSet) rs).next()) {
				Pessoa p = new Pessoa();
				p.setIdPessoa(((ResultSet) rs).getInt("id_pessoa"));
				p.setNomePessoa(((ResultSet) rs).getString("nome_pessoa"));
				p.setEmail(((ResultSet) rs).getString("email"));
				listaPessoas.add(p);
			}
			close();
			return listaPessoas;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;

	}

}
