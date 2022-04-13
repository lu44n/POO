import javax.swing.JOptionPane;
public class Soma {
    static public void main (String [] args){
        //Declaração de variáveis
        int valor1;
        int valor2;
        int resultado;

        //Entrada de valores
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        valor2 = Integer.parseInt (JOptionPane.showInputDialog("Digite o segundo valor"));

        //Cáculo do resultado
        resultado = valor1 + valor2;

        //Saída
        String s = ("Soma: " + resultado);
        JOptionPane.showMessageDialog(null, s);
    }
}
