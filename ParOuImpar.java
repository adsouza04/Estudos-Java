import java.util.Scanner;

class ParouImpar {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Me informe um número:");
        int numeroEscolhido = ler.nextInt();
        boolean isPar = numeroEscolhido % 2 == 0;

  
            System.out.println("O número " + numeroEscolhido + " é Par? " + isPar);
        
    }

}