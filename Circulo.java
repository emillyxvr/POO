public class Circulo {
    //atributos
    private int raio;

    //construtor
    public Circulo (int raio){
        this.raio = raio;
    }

    //métodos
    public double calcularArea(){
        return 3.141516 * raio * raio;
    }

    public double calcularPerimetro(){
        return 2 * 3.141516 * raio;
    }

    public void imprimir(){
        System.out.printf("Raio: %d, Área: %.2f, Perimetro: %.2f", raio, calcularArea(), calcularPerimetro());
    }
}