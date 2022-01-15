import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qntConsoantes =0;

        int count = 0;

        do{
            System.out.println("Letra: ");
            String letra = scan.next();

            if(!(letra.equalsIgnoreCase("a")|
                    letra.equalsIgnoreCase("e")|
                            letra.equalsIgnoreCase("i")|
                                    letra.equalsIgnoreCase("o")|
                                            letra.equalsIgnoreCase("u")|
                                                    letra.equalsIgnoreCase("a")
                                                    )) {
                                        consoantes[count] = letra;
                                        qntConsoantes++;
            }
                    count++;
        }while( count < consoantes.length);

        for (String consoante : consoantes) {
            System.out.print(consoante + " ");
        }
    }
}
