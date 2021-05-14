package funcionarios;

public class TesteFuncionario {

    public static void main(String[] args) {

        Gerente nico = new Gerente();
        nico.setNome("Nico Sttepat");
        nico.setCpf("123456789-89");
        nico.setSalario(2500.00);

        System.out.println(nico.getNome());
        System.out.println(nico.getbonificacao());

        Funcionario f1 = new EditorVideo();
        f1.setNome("Flavio");
        f1.setSalario(3000.0);
        f1.setCpf("123456789-89");

        System.out.println(f1.getNome());
        System.out.println(f1.getbonificacao());

        Funcionario f2 = new Gerente();
        f2.setNome("Bruno");
        f2.setSalario(5000.0);

        System.out.println(f2.getNome());
        System.out.println(f2.getSalario());

        Funcionario f3 = new Designer();
        f3.setNome("Andre");
        f3.setSalario(10000.0);

        System.out.println(f3.getNome());
        System.out.println(f3.getSalario());

    }

}
