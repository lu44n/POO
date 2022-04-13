import javax.swing.JOptionPane;
public class Exercicio2String {
    static public void main (String [] args){
        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o seu peso: "));
        
        String texto = String.format("Olá, %s. Você tem %d anos e pesa %.2fkg.", nome, idade, peso);
        
        JOptionPane.showMessageDialog(null, texto);
    }
}