package conta;

public class CalculadorUtil {

    private double aliquota;

    public boolean getValorImposto(double aliquota) {
        if(this.aliquota == aliquota) {
            return true;
        }
        return false;
    }
}
