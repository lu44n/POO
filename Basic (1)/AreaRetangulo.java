import javax.swing.JOptionPane;
public class AreaRetangulo {
    public static void main (String [] args){
        //Declaração de variáveis
        double base, altura, resultado;

        //entrada
        base = Double.parseDouble (JOptionPane.showInputDialog("Digite o valor da base: "));
        altura = Double.parseDouble (JOptionPane.showInputDialog("Digite o valor da altura: "));

        //processamento
        resultado = base * altura;
        
        //saída
        String s = "A área do retângulo de base: " + base + "e de altura: " + altura + ", tem o valor de: " + resultado;
        
        JOptionPane.showMessageDialog(null, s);
    
    }
}
