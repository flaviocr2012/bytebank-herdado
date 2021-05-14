package conta;

public class TesteSaque {

    public static void main(String[] args) {

        Conta cc = new ContaCorrente(132, 4561);
        cc.deposita(300);

        try {
            cc.saca(310);
        } catch (SaldoInsuficienteException ex) {
            System.out.println("Ex: " + ex.getMessage());
        }

        System.out.println(cc.getSaldo());

    }
}
