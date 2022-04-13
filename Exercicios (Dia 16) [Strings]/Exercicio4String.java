import javax.swing.JOptionPane;
public class Exercicio4String {
    static public void main (String [] args){
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        String sobrenome = JOptionPane.showInputDialog("Digite seu sobrenome: ");

        // String nomeCompleto = nome.concat(" ").concat(sobrenome);
        
        String texto = String.format("Olá! Seu nome é %s e seu sobrenome é %s", nome, sobrenome);

        JOptionPane.showMessageDialog(null, texto);
    }
}
