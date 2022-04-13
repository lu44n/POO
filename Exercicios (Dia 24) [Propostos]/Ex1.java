import java.util.Random;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random sorteador = new Random();
        System.out.println("Caro usuário, quantos sorteios você deseja?");
        int n = leitor.nextInt();
        int cont = 1;
        while(cont <= n){
            int d1 = sorteador.nextInt(1, 7);
            int d2 = sorteador.nextInt(1, 7);
            /*if (d1 > d2)
                System.out.printf("%d %c %d\n", d1, '>', d2);
            else if ( d1 < d2 )
                System.out.printf("%d %c %d\n", d1, '<', d2);
            else 
                System.out.printf("%d %c %d\n", d1, '=', d2);*/
            System.out.printf("%d %c %d\n", d1, d1 > d2 ? '>' : d1 < d2 ? '<' : '=', d2); // operador ternário
            cont++;
        }
        leitor.close();
    }
}