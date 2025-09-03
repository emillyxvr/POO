public class Transportadora{
    private Encomenda[] encomenda; //vetor de obj do tipo encomenda, vai armazenar todas as encomendas
    private int quantidade;

    public Transportadora(int quantidade){ //cria uma transportadora com capacidade máx. igual ao valor no parâmetro
        this.quantidade = 0; //ainda n foram adicionadas encomendas
        this.encomenda = new Encomenda[quantidade]; //cria o vetor de encomendas com o tamanho definido, mas ainda vazio
    }

    public boolean adicionarEncomenda(Encomenda e){ //Encomenda e - adiciona uma encomenda
        if(quantidade == this.encomenda.length) return false; //se a transportadora tiver cheia, retorna false
        encomenda[quantidade++] = e;
        return true;  //caso contrário, retorna true e adiciona a encomenda na próxima posição livre do vetor
    }

    public void listarEncomendas(){
        for (int i = 0; i < quantidade; i++){ //percorre todas as encomendas cadastradas (i representa o uqe tem no vetor)
            encomenda[i].exibirInfo(); //pra cada encomenda, imprime todas as infor. com o exibirInfo
        }
    }

    public Encomenda buscarPorCodigo(int codigo){
        for (int i = 0; i < quantidade; i++) { //percorre todos as encomendas cadastradas
         if (encomenda[i].getCodigo() == codigo) { //pra cada encomenda, compara o cod. com o q foi passado como parâmetro
            return encomenda[i]; //se encontrar, retorna o obj Encomenda correspondente
         }
        }
      return null; //se n encontrar, retorna null
    }

    public void atualizar(String status){
        for (int i = 0; i < quantidade; i++){ //cria uma variáv. de controle i q cmc em 0 e enqt i for menor q qntd. o laço continua
//i++: aumenta o valor da variável em 1, usando primeiro o valor atual de i, dps soma 1 (incremento)
            encomenda[i].atualizarStatus(status); //acessa a posição i do vetor encomenda, e atualiza o status de todas as encomendas p/ o vetor recebido
        }
    }
}