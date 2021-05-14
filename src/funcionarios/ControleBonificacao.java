package funcionarios;

public class ControleBonificacao {

    private double soma;

    // utilizo um único método para os três objetos(funcionário, gerente e editor de vídeo)
    public void registra(Funcionario f) {
         double boni = f.getbonificacao();
        this.soma = this.soma + boni;
    }

    public double getSoma() {
        return soma;
    }
}