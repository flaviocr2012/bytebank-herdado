package conta;

public class AcaoBolsa extends Conta implements Tributavel {

    private CalculadorUtil calculador;

    public AcaoBolsa() {
        super();
        this.calculador = new CalculadorUtil();
    }

    @Override
    public boolean getValorImposto(double aliquota) {
        return this.calculador.getValorImposto(aliquota);
    }

    @Override
    public void deposita(double valor) {

    }
}
