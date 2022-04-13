import javax.swing.JOptionPane;
public class AreaCirculo{
    public static void main (String [] args){
        //Declaração de variáveis
        double raio;
        double pi;
        double resultado;

        //Entrada dos valores
        raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio: "));

        //Cálculo da área
        pi = 3.14;
        resultado =  raio * raio * pi;

        //Saída
        JOptionPane.showMessageDialog(null, String.format("O valor da área é de: %.2f", resultado));
    }
}