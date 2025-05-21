public class Funcionario {
    //atributos
    private int cod;
    private String nome;
    private String CPF;
    private String endereco;
    private String telefone;
    private int idade;
    private double salario;

    //construtor
    public Funcionario(int cod, String nome, String CPF, String endereco, String telefone, int idade, double salario){
        this.cod = cod;
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idade = idade;
        this.salario = salario;
    }

    //métodos
    public int getCod(){
        return cod;
    }
    public void setCod(int cod){
        this.cod = cod;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCPF(){
        return CPF;
    }
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    public String toString(){
        return " cod" + cod + " nome:" + nome + " CPF" + CPF + " endereço:" + endereco + " telefone" + telefone + " idade:" + idade + " salário:" + salario;
    }

    public double calculaSalarioLiquido(){
        return salario * 0.89;
    }

    public void imprimir (){
        System.out.printf("Código: %d\n", cod);
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("CPF: %s\n", CPF);
        System.out.printf("Endereço: %s\n", endereco);
        System.out.printf("Telefone: %s\n", telefone);
        System.out.printf("Idade: %d\n", idade);
        System.out.printf("Salário: %.2f \n", salario);
    }
}