import javax.swing.JOptionPane;
public class Exercicio1 {
    static public void main (String [] args){
        String nomeCompleto = JOptionPane.showInputDialog("Digite o seu nome e sobrenome: ");
        String nome = nomeCompleto.substring(0, nomeCompleto.indexOf(" "));
        String sobrenome = nomeCompleto.substring(nomeCompleto.indexOf(" "));

        JOptionPane.showMessageDialog(null, String.format("Olá %s. Seu sobrenome é %s.", nome, sobrenome));
    }
}
