import javax.swing.JOptionPane;
public class Teste{
    public static void main (String [] args){
        //Declaração de variáveis
        int valorFabrica;
        double porcentagemDistribuidor;
        double porcentagemImpostos;
        double valorFinal;
        
        //Importe de valores
        valorFabrica = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do veículo:"));
        porcentagemDistribuidor = 0.28;
        porcentagemImpostos = 0.45;
        
        // Processamento
        valorFinal = valorFabrica + (valorFabrica * porcentagemDistribuidor) + (valorFabrica * porcentagemImpostos);
        
        // Saída
        String s = ("O valor final do veículo será de: " + valorFinal);
        JOptionPane.showMessageDialog(null, s);

    }
}