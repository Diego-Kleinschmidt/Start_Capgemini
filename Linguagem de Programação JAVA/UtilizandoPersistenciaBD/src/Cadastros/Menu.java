package Cadastros;

import java.util.List;

public class Menu {

	public static void main(String[] args) {
		PessoaDao pd = new PessoaDao();

		try {
			/*
			Pessoa p1 = new Pessoa("josé", "Mario@bol.com");
			Pessoa p2 = new Pessoa("Diego", "Diego@gmail.com");
			pd.incluirPessoa(p1);
			pd.incluirPessoa(p2);

			Pessoa pes = pd.consultaPessoaIndividual(2);
			if (pes != null) {
				pes.setEmail("joao2@gmail.com");
				pd.alteraPesoa(pes);
			}
			
			Pessoa pes = pd.consultaPessoaIndividual(5);
			pd.excluirPessoa(pes);
			*/
			Pessoa pes = pd.consultaPessoaIndividual(5);
			System.out.println("Id.....: " + pes.getIdPessoa());
			System.out.println("Nome...: " + pes.getNomePessoa());
			System.out.println("Email..: " + pes.getEmail() + "\n");
				
			List<Pessoa> listaPessoa = pd.ListarPessoa();
			for (Pessoa p : listaPessoa) {
				System.out.println("Id.....: " + p.getIdPessoa());
				System.out.println("Nome...: " + p.getNomePessoa());
				System.out.println("Email..: " + p.getEmail());
				System.out.println("------------------------------------\n");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
