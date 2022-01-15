import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetor = { -5, -6, 15,50, 8, 4 };

        System.out.println("Vetor: ");
        int count=0;
        while( count < (vetor.length)){
            System.out.printf(vetor[count] + ", ");
            count ++;
        }

        System.out.println("\n***********");
        System.out.println("Vetor ( ordem inversa ): ");

        for( int i = ( vetor.length -1 ); i >=0 ; i--){
            System.out.printf(vetor[i] + ", ");
        }


    }
}
