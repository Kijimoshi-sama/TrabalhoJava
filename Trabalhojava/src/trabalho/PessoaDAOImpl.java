package trabalho;

public class PessoaDAOImpl implements PessoaDAO {
    @Override
    public void criarPessoa(Pessoa pessoa) {
        try (Connection conexao = Conexao.obterConexao();
             PreparedStatement stmt = conexao.prepareStatement("INSERT INTO pessoas (nome, endereco, telefone, tipo) VALUES (?, ?, ?, ?)")) {
            stmt.setString(1, pessoa.nome);
            stmt.setString(2, pessoa.endereco);
            stmt.setString(3, pessoa.telefone);
            stmt.setString(4, pessoa.getTipo());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pessoa criada com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao criar pessoa: " + e.getMessage());
        }
    }

    @Override
    public void atualizarPessoa(Pessoa pessoa) {
        try (Connection conexao = Conexao.obterConexao();
             PreparedStatement stmt = conexao.prepareStatement("UPDATE pessoas SET nome = ?, endereco = ?, telefone = ? WHERE tipo = ?")) {
            stmt.setString(1, pessoa.nome);
            stmt.setString(2, pessoa.endereco);
            stmt.setString(3, pessoa.telefone);
            stmt.setString(4, pessoa.getTipo());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pessoa atualizada com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar pessoa: " + e.getMessage());
        }
    }

    @Override
    public void deletarPessoa(Pessoa pessoa) {
        try (Connection conexao = Conexao.obterConexao();
             PreparedStatement stmt = conexao.prepareStatement("DELETE FROM pessoas WHERE tipo = ?")) {
            stmt.setString(1, pessoa.getTipo());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pessoa deletada com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar pessoa: " + e.getMessage());
        }
    }

    @Override
    public ArrayList<Pessoa> listarPessoas() {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        try (Connection conexao = Conexao.obterConexao();
             Statement stmt = conexao.createStatement();
             ResultSet rs = stmt.executeQuery
    }
