import javax.swing.JOptionPane;
public class Predecessor {
    public static void main (String [] args){
        //Declaração de variáveis
        int sucessor, result;

        //entrada
        sucessor = Integer.parseInt (JOptionPane.showInputDialog("Insira o número desejado: "));

        //processamento
        result = sucessor - 1;

        //saída
        String s = "O antecessor do número: " + sucessor + ", é: " + result;

        JOptionPane.showMessageDialog(null, s);
    
    }
}
