import javax.swing.JOptionPane;
public class Exercicio3 {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Digite uma string: ");
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));

        JOptionPane.showMessageDialog(null, s.substring(a, b + 1));
    }
}
