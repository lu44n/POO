import javax.swing.JOptionPane;
public class TransformarAnosEmDias {
    static public void main (String[] args){
      //Declaração de variáveis
      int years;
      int days;

      //entrada
      years = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de anos a ser convertido: "));

      //processamento
      days = years * 365;

      //saída
      String s = ("A quantidade de dias é: " + days);
      
      JOptionPane.showMessageDialog(null, s);
     
    }
}
