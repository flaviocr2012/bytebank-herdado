package conta;

public class SeguroDeVida implements Tributavel {

    private CalculadorUtil calculador;

    public SeguroDeVida () {
        this.calculador = new CalculadorUtil();
    }

    @Override
    public boolean getValorImposto(double aliquota) {
        return this.calculador.getValorImposto(aliquota);
    }
}
