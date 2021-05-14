package conta;

public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numero) {
        Conta.total++;
        this.saldo = 100;
        this.agencia = agencia;
        this.numero = numero;
    }

    public Conta() {

    }

    //     Quando o método é abstrato, as classes filhas devem implementá-lo.
    public abstract void deposita(double valor);

    public void saca(double valor) throws SaldoInsuficienteException{
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("saldo insuficiente: " + this.saldo);
        }
        this.saldo -= valor ;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
        destino.deposita(valor);
        }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Conta.total = total;
    }

}
