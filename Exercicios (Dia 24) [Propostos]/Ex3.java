import javax.swing.JOptionPane;
public class Ex3 {
    public static void main(String[] args) {
        int entrada;
        int a, b;
        do{
            entrada = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma das opções: "));
            switch (entrada){
                case 1:
                    a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
                    b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
                    JOptionPane.showMessageDialog(null, a + b);
                    break;
                case 2:
                    a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
                    b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
                    JOptionPane.showMessageDialog(null, a - b);
                    break;
                case 3:
                    a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
                    b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
                    JOptionPane.showMessageDialog(null, a * b);
                    break;
                case 4: 
                    a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
                    b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
                    JOptionPane.showMessageDialog(null, a / b);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Até mais!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Apenas números de 1 a 5!");
                    break;
            }
        }while(entrada != 5);
    }
}