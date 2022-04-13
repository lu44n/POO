import javax.swing.JOptionPane;
public class Exercicio {
    static public void main (String [] args){
        //Declaração de variáveis
        int x1;
        int x2;
        int y1;
        int y2;
        double resultado;

        //Entrega dos valores
        x1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da coordenada x1: "));
        x2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da coordenada x2: "));
        y1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da coordenada y1: "));
        y2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da coordenada y2: "));

        //Processamento do resultado
        resultado = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
        //Saída
        JOptionPane.showMessageDialog(null, String.format("A distãncia entre os pontos é de: %.2f", resultado));

    }
}

