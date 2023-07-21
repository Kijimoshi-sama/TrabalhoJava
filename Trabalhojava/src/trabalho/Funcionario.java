package trabalho;

public class Funcionario extends Pessoa {
    public Funcionario(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
    }

    @Override
    public String getTipo() {
        return "Funcionário";
    }
}
