import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Informe um valor entre 0 e 10: ");
        nota = scan.nextInt();

        while(nota < 0 | nota > 10 ){
            System.out.println("Nota Invalida!. Digite novamente.");
            nota = scan.nextInt();
        }

    }
}
