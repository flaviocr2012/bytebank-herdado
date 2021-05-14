package funcionarios;

import com.sun.security.jgss.GSSUtil;

public class TesteGerente {

    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setSenha(1234);
        g1.setNome("Nico");
        g1.setSalario(5000.0);
        g1.setCpf("132456123");

        System.out.println(g1.getNome());
        System.out.println(g1.getSalario());
        System.out.println(g1.getCpf());

        boolean autenticou = g1.autentica(1234);
        System.out.println(autenticou);







    }

}
