package conta;

public class ContaCorrente extends Conta implements Tributavel {

    private CalculadorUtil calculador;

    public ContaCorrente () {
        super();
        this.calculador = new CalculadorUtil();
    }

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public boolean getValorImposto(double aliquota) {
        return this.calculador.getValorImposto(aliquota);
    }

    @Override
    public void deposita(double valor) {
        super.saldo = +valor;
    }

    @Override
    public void saca(double valor) throws SaldoInsuficienteException {
        double tarifa = valor + 0.2;
        super.saca(tarifa);
    }

}

