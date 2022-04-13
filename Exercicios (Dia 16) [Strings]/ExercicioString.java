import javax.swing.JOptionPane;
public class ExercicioString {
    static public void main (String [] args){
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        int comprimento = nome.length();

        JOptionPane.showMessageDialog(null, "Olá" + nome + ", seu nome tem" + comprimento + "caracteres.");
    }
}
