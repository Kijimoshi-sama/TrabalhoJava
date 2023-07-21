package trabalho;

public interface PessoaDAO {
	void criarPessoa(Pessoa pessoa);
	void atualizarPessoa(Pessoa pessoa);
	void deletarPessoa(Pessoa pessoa);
	ArrayList<Pessoa> listarPessoas();
}
