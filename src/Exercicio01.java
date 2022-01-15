import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {

            System.out.println("Informe o nome do aluno: ");
            nome = scan.next();

            if(nome.equals("0"))break;

            System.out.println("Informe a iadde do aluno: ");
            idade = scan.nextInt();
        }

        System.out.println("Fim do laço de repetição.");

    }
}
