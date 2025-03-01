import java.util.Scanner;

class JoKenPo {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Jogador número 1, me informe qual opção você quer jogar: ");
        System.out.println("- Pedra");
        System.out.println("- Papel");
        System.out.println("- Tesoura");
        System.out.println("==========================================================");
        String jogador1 = ler.next();

        System.out.println("==========================================================");

        System.out.println("Jogador número 2, me informe qual opção você quer jogar: ");
        System.out.println("- Pedra");
        System.out.println("- Papel");
        System.out.println("- Tesoura");
        System.out.println("==========================================================");
        String jogador2 = ler.next();

        if (jogador1.equals("Papel") && jogador2.equals("Pedra")) {
            System.out.println("Jogardor 1 ganhou! ");
        }
        if (jogador1.equals("Tesoura") && jogador2.equals("Pedra")) {
            System.out.println("Jogador 2 ganhou! ");
        }
        if (jogador1.equals("Pedra") && jogador2.equals("Pedra")) {
            System.out.println("Deu empate");
        }
        if (jogador1.equals("Papel") && jogador2.equals("Papel")) {
            System.out.println("Deu empate");
        }
        if (jogador1.equals("Tesoura") && jogador2.equals("Papel")) {
            System.out.println("Jogador 1 ganhou!");
        }
        if (jogador1.equals("Pedra") && jogador2.equals("Papel")) {
            System.out.println("Jogador 2 ganhou!");
        }
        if (jogador1.equals("Papel") && jogador2.equals("Tesoura")) {
            System.out.println("Jogador 2 ganhou!");
        }
        if (jogador1.equals("Tesoura") && jogador2.equals("Tesoura")) {
            System.out.println("Deu empate");
        }
        if (jogador1.equals("Pedra") && jogador2.equals("Tesoura")) {
            System.out.println("Jogador 1 ganhou!");
        }

    }

}