public class principalconta {
    public static void main(String[] args) {
        conta c1 = new conta(26478,"Mariana Rodrigues");
        conta c2 = new conta(76430,"Érika Christiny");
        conta c3 = new conta(21367,"Isadora Benício");
    

    //exibir o estado das contas
    System.out.println("Estado inicial das contas: ");
    c1.exibir();
    c2.exibir();
    c3.exibir();
    
    System.out.println("Depositar na conta: ");
    c1.depositar(900);
    c2.depositar(4);
    c3.depositar(1000);

    System.out.println("Estado da conta após o depósito: ");
    c1.exibir();
    c2.exibir();
    c3.exibir();

    System.out.println("Nome: ");
    c1.setNome("Henrique Souza");
    c2.setNome("Juliana Silva");
    c3.setNome("Rayssa Xavier");

    c1.sacar(50);
    c2.sacar(1);
    c3.sacar(700);

    System.out.println("Estado após saques: ");
    c1.exibir();
    c2.exibir();
    c3.exibir();
    
    //Desativando contas
    c1.desativar();
    c3.desativar();

    //Exibir estado final
    System.out.println("Estado final após desativar duas contas: ");
    c1.exibir();
    c2.exibir();
    c3.exibir();
    }
}