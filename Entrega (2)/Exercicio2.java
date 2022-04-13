import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Digite uma senha de comprimento igual a 4, com primeiro símbolo igual a A ou a e que contenha pelo menos um número ímpar.");
        String senha = JOptionPane.showInputDialog("Digite a senha desejada: ");
        int comprimento = senha.length();
        char primeiraLetra = senha.charAt(0);

        if ((comprimento == 4) && (primeiraLetra == 'A' || primeiraLetra == 'a') && (senha.contains("1") || senha.contains("3") || senha.contains("5") || senha.contains("7") || senha.contains("9"))){
            JOptionPane.showMessageDialog(null, "A senha foi criada com sucesso!");
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR: Siga o modelo pré definido!");
        }
    }
}
