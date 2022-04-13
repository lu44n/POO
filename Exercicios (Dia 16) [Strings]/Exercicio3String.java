import javax.swing.JOptionPane;
public class Exercicio3String {
    static public void main (String [] args){
        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        char primeiraLetra = nome.charAt(0);
        char segundaLetra = nome.charAt(1);

        JOptionPane.showMessageDialog(null, String.format("Olá %s, a primeira letra do seu nome é %c e a segunda é %c", 
        nome, primeiraLetra, segundaLetra));
    }
}