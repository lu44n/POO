import java.util.Scanner;
public class Exemplo2String {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a primeira string");
        String s1 = leitor.nextLine();
        System.out.println("Digite a segunda string");
        String s2 = leitor.nextLine();
        
        int resultado = s1.compareTo(s2);
        if (resultado < 0)
            System.out.printf("%s vem antes de %s\n", s1, s2);
        else if (resultado == 0)
            System.out.printf("%s é igual a %s\n", s1, s2);
        else
            System.out.printf("%s vem depois de %s\n", s1, s2);

        leitor.close();
    }
}
