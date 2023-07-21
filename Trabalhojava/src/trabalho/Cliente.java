package trabalho;

public class Cliente extends Pessoa {
    public Cliente(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
    }

    @Override
    public String getTipo() {
        return "Cliente";
    }
}