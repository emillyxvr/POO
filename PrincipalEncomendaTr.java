import java.util.Scanner; //importa a classe scanner (permite ler dados pelo teclado)

public class PrincipalEncomendaTr {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        Transportadora t = new Transportadora(5); //cria um obj com capc. 5 encomendas
        int codigo;
        String destinatario;
        String endereco;
        String status;

        for(int i = 0; i < 5; i++){ //laço que vai repetir 5 vezes p o cadastro de 5 enc.
            System.out.println("Digite o código da encomenda: ");
            codigo = teclado.nextInt(); teclado.nextLine(); //evita que pule a próxima entrada

            System.out.println("Digite o destinatário: ");
            destinatario = teclado.nextLine();

            System.out.println("Digite o endereço: ");
            endereco = teclado.nextLine();

            System.out.println("Digite o status da encomenda: ");
            status = teclado.nextLine();

            t.adicionarEncomenda(new Encomenda(codigo, destinatario, endereco, status));  //cria um novo obj Encomenda com as info inseridas
            //chama o met. add da Transportadora t p/ add a encomenda no vetor da transportadora
        }

         System.out.println("=== Lista de encomendas ===");
            t.listarEncomendas(); //exibe a lista completa de encomendas

        //Busca de encomendas por código - lê o cod desejado e armazena na variável buscarPorCodigo
        System.out.println("=== Busca de Encomendas por Código ===");
        System.out.println("Digite o Código da encomenda que você procura: ");
        int buscarPorCodigo = teclado.nextInt();

         Encomenda e = t.buscarPorCodigo(buscarPorCodigo); //chama buscarPorCodigo e armazena o resultado encontrado
        if (e != null) { //se e for diferente de null mostra as infos da encomenda com exibirInfo()
            e.exibirInfo(); 
        }
        else {
            System.out.println("Encomenda não encontrada."); //se n, exibe a msg
        }

        e.atualizarStatus("Entregue");

        System.out.println("=== Lista de encomendas após atualização ===");
            t.listarEncomendas();
    }
}