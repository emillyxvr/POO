public class Encomenda{
    private int codigo;
    private String destinatario;
    private String endereco;
    private String status; //"postado", "em trânsito", "entregue"

    public Encomenda(int codigo, String destinatario, String endereco, String status){
        this.codigo = codigo;
        this.destinatario = destinatario;
        this.endereco = endereco;
        this.status = status;
    }

    public String toString(){
        return
        "Código da encomenda: " + codigo +
        "\n Destinatário: " + destinatario +
        "\n Endereço: " + endereco +
        "\n Status da encomenda: " + status;
    }

    public void exibirInfo(){
        System.out.println(toString());
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
        System.out.println("Status atualizado para: " + status);
    }

    public int getCodigo(){
        return codigo;
    }
}