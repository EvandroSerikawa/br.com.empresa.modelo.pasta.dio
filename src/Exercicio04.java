import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int Qtnumeros;
        int numero;
        int par =0;
        int impar =0;
        int count = 0;

        System.out.println("Informe quantidade de numeros: ");
        Qtnumeros = scan.nextInt();

        do{
            System.out.println("Informe 01 numero: ");
            numero = scan.nextInt();

            if( numero % 2 == 0){
                par++;
            } else {
                impar++;
            }
            count ++;

        }while( count < Qtnumeros);

        System.out.println("Qunatidade de numeros pares: " + par );
        System.out.println("Quantidade de numeros impares: " + impar );
    }
}

