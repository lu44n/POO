import javax.swing.JOptionPane;
public class SomaDosQuadrados{
    static public void main(String[] args){
        //Declaração de variáveis
        double a, b, c, d, e;
        
        //entrada
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro valor: "));
        d = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto valor: "));

        //processamento
        e = a * a + b * b + c * c + d * d;

        //saida
        JOptionPane.showMessageDialog(null, e);
    
    }
}