import java.util.Scanner;


class CalculoMediaAluno {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Me informe sua primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.println("Me informe a segunda nota: ");
        double nota2 = scan.nextDouble();

        double soma = (nota1 + nota2) / 2;

        if (soma >= 6 && soma < 9 ) {
            System.out.println("Parabéns você passou!");

        }
        else if (soma < 6) {
            System.out.println("Você foi reprovado");
        }

        else if (soma >= 9) {
            System.out.println("MUITO BEMM!!! Você foi aprovado, como nota superior ou igual a 9");
        }

        System.out.println("Sua média é: " + soma);
    }

}