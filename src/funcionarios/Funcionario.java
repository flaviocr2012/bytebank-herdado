package funcionarios;

// classes abstratas não podem ser instanciadas
public abstract class Funcionario {

    private String nome;
    private String cpf;
    // público para as classes filhas
//    protected double salario;
    private double salario;

    // Não há implementação. Método sem corpo.
    public abstract double getbonificacao(); { // essa parte é a assinatura do método.
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
