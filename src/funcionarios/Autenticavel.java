package funcionarios;

// contrato Autenticavel. Quem assina esse contrato, precisa implementar:
// método setSenha e método autentica.
// Interface não possui reutilização de código. É uma alternativa ao polimorfismo.
public abstract interface Autenticavel {


    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);

}
