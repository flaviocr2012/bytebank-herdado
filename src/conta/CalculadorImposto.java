package conta;

public class CalculadorImposto {

    private double aliquota = 10.0;

    public void calcula(Tributavel t) {
        boolean valor = t.getValorImposto(this.aliquota);
    }
}
