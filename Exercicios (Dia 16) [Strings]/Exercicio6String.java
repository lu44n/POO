import javax.swing.JOptionPane;
public class Exercicio6String {
    static public void main (String [] args){
        String s1 = JOptionPane.showInputDialog("Digite a primeira String: ");
        String s2 = JOptionPane.showInputDialog("Digite a segunda String: ");

        if (s1.equalsIgnoreCase(s2)){
            JOptionPane.showMessageDialog(null, String.format("%s e %s são iguais!", s1, s2));
        }
        else{
            JOptionPane.showMessageDialog(null, String.format("%s e %s são diferentes!", s1, s2));
        }
    }
}
