package funcionarios;

import javax.naming.ldap.Control;

public class TesteReferencias {

    public static void main(String[] args) {

        // lado esquerdo é a referência, lado direito, o objeto.
        // Estou utilizando uma referẽncia genérica para três objetos diferentes. Nesse exemplo: Funcionário
        // O benefício do polimorfismo é desacoplar e criar independência entre os objetos.
        // Posso ter uma única referência para diversos objetos diferentes
        Funcionario g1 = new Gerente();
        g1.setSalario(5000.0);
        System.out.println(g1.getbonificacao());

        Funcionario d = new Designer();
        d.setSalario(2000.0);
        System.out.println(d.getbonificacao());

        Funcionario ev = new EditorVideo();
        ev.setSalario(2500.0);
        System.out.println(ev.getbonificacao());

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(d);
        controle.registra(ev);

        System.out.println(controle.getSoma());
    }

    }

