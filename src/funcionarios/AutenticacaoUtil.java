package funcionarios;

// Instanciei essa classe pra reaproveitar os códigos. Tecnicamente chamada de composição em Java.

public class AutenticacaoUtil {

    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        }
        return false;
    }
}
