public class conta{

//atributos
private int n_conta;
private String nome;
private double saldo;
private boolean ativa;

//construtor //(gerencia as informações pra adicionar novos objetos à classe)
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
        if (ativa == true && valor <= saldo && valor > 0) {
                saldo = saldo - valor;
        }
    }
    public void desativar() {
        if (ativa == true) {
            ativa = false;
        }
    }
    public void ativar() {
        if (ativa == false) {
            ativa = true;
        }
    }
   public void exibir(){
    System.out.println(this.toString());
   }
    public String toString(){  //retorna as informações
        return "Número da conta: " + n_conta +
        "\n Nome: " + nome +
        "\n Saldo: " + saldo +
        "\n Ativa? " + ativa;
    }

    public int getNumeroconta() {
        return n_conta;
    }
    public void setNumeroconta( int n_conta){
        this.n_conta = n_conta;
    }
    public String getNome() {
        return nome;
    }
    public void setNome( String nome){
        this.nome = nome;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public boolean getAtiva() {
        return ativa;
    }
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
 }

