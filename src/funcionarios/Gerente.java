package funcionarios;

public class Gerente extends Funcionario implements Autenticavel {

    private AutenticacaoUtil autenticador;

    public Gerente() {
        this.autenticador = new AutenticacaoUtil();
    }
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);

    }

    @Override
    public double getbonificacao() {
        return 0;
    }


    //    public double getBonificacao() {
//        // salário está definido na classe mãe(funcionários)
//        System.out.println("Chamando o método de bonificacao do gerente");
//        return super.getbonificacao() + super.getSalario();
//    }
}
