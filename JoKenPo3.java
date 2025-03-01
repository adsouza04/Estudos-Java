import java.util.Scanner;

class JoKenPo3 {

    public static void printOpcoesDeJogo(String opcao1, String opcao2, String opcao3) {
        System.out.println("---> " + opcao1);
        System.out.println("---> " + opcao2);
        System.out.println("---> " + opcao3);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String pedra = "pedra";
        String papel = "papel";
        String tesoura = "tesoura";
        String jogador1Ganhou = "Parabéns jogador 1 você ganhou";
        String jogador2Ganhou = "Parabéns jogador 2 você ganhou";
        String empate = "Empatou";

        System.out.println("Jogador número 1, me informe qual opção você quer jogar: ");
        JoKenPo3.printOpcoesDeJogo(pedra, tesoura, papel);

        String jogador1 = ler.next();

        System.out.println("==========================================================");

        System.out.println("Jogador número 2, me informe qual opção você quer jogar: ");
        JoKenPo3.printOpcoesDeJogo(pedra, tesoura, papel);

        String jogador2 = ler.next();

        if (jogador1.equals(papel) && jogador2.equals(pedra)) {
            System.out.println(jogador1Ganhou);
        }
        if (jogador1.equals(tesoura) && jogador2.equals(pedra)) {
            System.out.println(jogador2Ganhou);
        }
        if (jogador1.equals(jogador2)) {
            System.out.println(empate);
        }
        if (jogador1.equals(tesoura) && jogador2.equals(papel)) {
            System.out.println(jogador1Ganhou);
        }
        if (jogador1.equals(pedra) && jogador2.equals(papel)) {
            System.out.println(jogador2Ganhou);
        }
        if (jogador1.equals(papel) && jogador2.equals(tesoura)) {
            System.out.println(jogador2Ganhou);
        }
        if (jogador1.equals(pedra) && jogador2.equals(tesoura)) {
            System.out.println(jogador1Ganhou);
        }

    }

}