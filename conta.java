public class conta{

//atributos
private int n_conta;
private String nome;
private double saldo;
private boolean ativa;

//construtor
    public conta(int n_conta, String nome) {
        this.n_conta = n_conta;
        this.nome = nome;
        this.saldo = 0;
        this.ativa = true;
    }

//métodos
    public void depositar(double valor) {
        if (ativa == true && valor > 0) {
                saldo = saldo + valor;
    }
    }
    public void sacar (double valor) {
        if (ativa == true && valor <= saldo) {
                saldo = saldo - valor;
        }
    }
    public void desativar() {
        if (ativa == true) {
            ativa == false;
        }
    }
    public void ativar() {
        if (ativa == false) {
            ativa == true;
        }
    }
    public void exibir (to String) {
        return "Número da conta: " + ativa +
               "\nNome: " + nome +
               "\nSaldo: " + saldo + 
               "\nAtiva: " + ativa;
    }
    
}