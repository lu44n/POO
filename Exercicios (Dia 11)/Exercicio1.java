import javax.swing.JOptionPane;
public class Exercicio1 {
    static public void main (String [] args){
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        String definicao;

        definicao = valor == 0 ? "O número é neutro" : valor > 0 ? "O número é positivo" : "O número é negativo";

        JOptionPane.showMessageDialog(null, definicao);
    }
}
