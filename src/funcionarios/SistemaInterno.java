package funcionarios;

public class SistemaInterno {

    private int senha = 2222;

    public void autentica (Autenticavel fa) {
        boolean autenticou = fa.autentica(this.senha);
        if(autenticou) {
            System.out.println("Você pode entrar");
        }

        System.out.println("Você não pode entrar");
    }
}
