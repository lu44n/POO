import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);

        System.out.println("Digite duas palavras: ");
        String s = leitor.nextLine();
        String palavraUm = s.substring(0, s.indexOf(" "));
        String palavraDois = s.substring(s.indexOf(" ") + 1, s.length());
        int comprimento1 = palavraUm.length();
        int comprimento2 = palavraDois.length();


        System.out.printf("O comprimento da palavra um é %d e o da palavra 2 é %d\n", comprimento1, comprimento2);

        leitor.close();
    }
}
