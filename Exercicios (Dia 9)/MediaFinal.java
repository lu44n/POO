import javax.swing.JOptionPane;
public class MediaFinal {
    static public void main (String [] args){
        //Declaração de variáveis
        double notaA;
        double notaB;
        double notaC;
        double media;

        //Entrada das notas
        notaA = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota A do aluno: "));
        notaB = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota B do aluno: "));
        notaC =  Double.parseDouble(JOptionPane.showInputDialog("Digite a nota C do aluno: "));

        //Cálculo da média
        media = ((2 * notaA) + (3 * notaB) + (5 * notaC)) / 10;

        //Saída
        JOptionPane.showMessageDialog(null, String.format("A média final do aluno será de: %.2f", media));
    }
}
