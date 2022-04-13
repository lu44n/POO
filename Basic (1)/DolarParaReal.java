import javax.swing.JOptionPane;
public class DolarParaReal{
    static public void main(String[] args){
        //declaração de variáveis
        double cotacaoDeDolar;
        int quantidadeDeDolar;
        double valorConvertido;

        //entrada
        cotacaoDeDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação do dolar: "));
        quantidadeDeDolar = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dolar: "));

        //processamento
        valorConvertido = cotacaoDeDolar * quantidadeDeDolar;

        //saída
        String s = "Dada a cotação do dólar de: " + cotacaoDeDolar + " e a quantidade de dólares: " + quantidadeDeDolar + ", o valor convertido é: " + valorConvertido;

        JOptionPane.showMessageDialog(null, s);

    }
}
