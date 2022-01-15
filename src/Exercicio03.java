import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int maior = 0;
        int soma = 0;

        do {
            System.out.println("Digite um numero: ");
            numero = scan.nextInt();
            count = count + 1;

            soma = soma + numero;
            System.out.println("Soma" + soma );

        }while (count < 5);

        System.out.println("O numero maior é:" + maior);
        System.out.println("Média" + soma/5);
    }
}
