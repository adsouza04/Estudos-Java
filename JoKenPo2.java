import java.util.Scanner;

class JoKenPo2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String pedra = "pedra";
        String papel = "papel";
        String tesoura = "tesoura";
        String jogador1Ganhou = "Parabéns jogador 1 você ganhou";
        String jogador2Ganhou = "Parabéns jogador 2 você ganhou";
        String empate = "Empatou";

        System.out.println("Jogador número 1, me informe qual opção você quer jogar: ");
        System.out.println("- " + pedra);
        System.out.println("- " + papel);
        System.out.println("- " + tesoura);
        System.out.println("==========================================================");
        String jogador1 = ler.next();

        System.out.println("==========================================================");

        System.out.println("Jogador número 2, me informe qual opção você quer jogar: ");
        System.out.println("- " + pedra);
        System.out.println("- " + papel);
        System.out.println("- " + tesoura);
        System.out.println("==========================================================");
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