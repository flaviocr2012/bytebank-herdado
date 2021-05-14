package conta;

public class TributavelTestes {
    public static void main(String[] args) {

        SeguroDeVida seguro = new SeguroDeVida();
        System.out.println(seguro.getValorImposto(0.1));

        AcaoBolsa acao = new AcaoBolsa();
        acao.getValorImposto(0.01);

        ContaCorrente conta = new ContaCorrente();
        conta.getValorImposto(0.05);



    }

}
