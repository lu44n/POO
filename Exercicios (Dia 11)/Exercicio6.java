import javax.swing.JOptionPane;
public class Exercicio6 {
    static public void main (String [] args){
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o número desejado: "));
        
        if  (valor % 4 == 0 && valor % 100 != 0){
            JOptionPane.showMessageDialog(null, "O número inserido é bissexto!");
        }
        else {
            if (valor % 400 == 0){
                JOptionPane.showMessageDialog(null, "O número inserido é bissexto!");
            }
            else{
            JOptionPane.showMessageDialog(null, "O número inserido não é bissexto!");
            }
        }
    }
} 