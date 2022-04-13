import javax.swing.JOptionPane;
import java.util.*;
public class Ex4 {
    public static void main(String[] args){
        
        int number;
        int soma = 0;
        int soma2 = 0;
        int media;
        int media2;
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> lista = new ArrayList<Integer>();
        
        do{
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
            if (number > 0){
                list.add(number);
            }
            if(number % 2 == 0 && number != 0){
                lista.add(number);
            }
        }while(number > 0);
        
        //Soma dos números inseridos
        for(int cont = 0; cont < list.size(); cont++){
            soma += list.get(cont);
        }
        JOptionPane.showMessageDialog(null, "A soma dos elementos da lista é: " + soma);
        
        //Média dos números inseridos
        media = soma / list.size();
        JOptionPane.showMessageDialog(null, "A média dos elementos da lista é: " + media);

        //Quantidade de números inseridos
        JOptionPane.showMessageDialog(null, "A quantidade de números digitados é: " + list.size());

        //O maior número inserido
        Integer max = Collections.max(list);
        JOptionPane.showMessageDialog(null, "O maior número inserido é: " + max);

        //O menor número inserido
        Integer min = Collections.min(list);
        JOptionPane.showMessageDialog(null, "O menor número inserido é: " + min);

        //Média dos pares
        for(int contador = 0; contador < lista.size(); contador++){
            soma2 += lista.get(contador);
        }
        media2 = soma2 / lista.size();
        JOptionPane.showMessageDialog(null, "A média dos pares é: " + media2);
    }
}