public class FitaDeVideo {
    //atributos
    private String titulo;
    private double preco;

    //coonstrutor
    public FitaDeVideo(String titulo, double preco){
        this.titulo = titulo;
        this.preco = preco;
    }

    //métodos
    public String getTitulo(){
        return titulo;
    }
    public double getPreco(){
        return preco;
    }
    public double getValorAluguel(int numeroDeDiasAlugada){
        return preco * numeroDeDiasAlugada;
    }
    public void imprimir(int numeroDeDiasAlugada){
        System.out.printf("Titulo; %s\n", titulo);
        System.out.printf("Preço do aluguel por dia: R$ %.2f \n", preco);
        System.out.printf("Valor do aluguel para %d dias: R$ %.2f \n", numeroDeDiasAlugada, getValorAluguel(numeroDeDiasAlugada));
    }
}
