import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor para a Tabuada: ");
        int num = scan.nextInt();

        for( int i = 1 ; i <= 10 ; i++){
            System.out.println("Tabuada do: " + num + "X" + i +"=" + (num * i));
        }
    }
}
