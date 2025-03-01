import java.util.Scanner;

class ParouImpar {

    public static boolean ParImpar(int numero) {
        boolean resultado = numero % 2 == 0;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Me informe um número:");
        int numeroEscolhido = ler.nextInt();
        boolean isPar = ParouImpar.ParImpar(numeroEscolhido);

        System.out.println("O número " + numeroEscolhido + " é Par? " + isPar);
        
    }

}