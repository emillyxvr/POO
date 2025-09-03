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

    public String toString(){ //retorna uma representação textual do obj.
        return
        "Código da encomenda: " + codigo +
        "\n Destinatário: " + destinatario +
        "\n Endereço: " + endereco +
        "\n Status da encomenda: " + status;
    }

    public void exibirInfo(){ //chama o toString pra exibir as inform. na tela
        System.out.println(toString());
    }

    public void atualizarStatus(String novoStatus) { //atualiza o status da encomenda e imprime a nova situação 
        this.status = novoStatus; //troca o valor do atributos pelo parâmetro recebido
        System.out.println("Status atualizado para: " + status);
    }

    public int getCodigo(){ //método get que vai servir p/ o método buscarPorCodigo
        return codigo;
    }
}