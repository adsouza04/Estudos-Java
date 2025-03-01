import java.util.Scanner;

class Acai {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Me informe quantos açai pequeno você gostaria: ");
        int acaiP = ler.nextInt();

        System.out.println("Me informe quantos açai médio você gostaria: ");
        int acaiM = ler.nextInt();

        System.out.println("Me informe quantos açai grande você gostaria: ");
        int acaiG = ler.nextInt();

        System.out.println("Informe seu cupom de desconto: ");
        String cupom = ler.next();

        double descontoCupom;
    
        if (cupom.equals("PRIMEIRA")) {
         descontoCupom = 10;
        }
        else if (cupom.equals("VERAO")) {
            descontoCupom = 12;
        }
        else {
            descontoCupom = 0;
        }

        double valor = (13.50 * acaiP) + (15.00 * acaiM) + (20.00 * acaiG);
        double desconto = valor - descontoCupom;

        System.out.println("O total é de: " + valor);
        System.out.println("O valor do desconto é de: " + descontoCupom);
        System.out.println("O valor total a ser pago é de: " + desconto);


    }
       


}
