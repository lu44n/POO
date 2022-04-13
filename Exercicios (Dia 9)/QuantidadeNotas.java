import javax.swing.JOptionPane;
public class QuantidadeNotas {
    static public void main (String [] args){
        //Declaração de variáveis
        int valor;
        int divisao200;
        int divisao100;
        int divisao50;
        int divisao20;
        int divisao10;
        int divisao5;
        int divisao2;
        int divisao1;
        int resultado;
 
        //Entrada do valor
        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor selecionado: "));

        //Cálculo da quantidade de notas
        divisao200 = valor / 200;
        divisao100 = valor % 200 / 100;
        divisao50 = valor % 200 % 100 / 50;
        divisao20 = valor % 200 % 100 % 50 / 20;
        divisao10 = valor % 200 % 100 % 50 % 20 / 10;
        divisao5 = valor % 200 % 100 % 50 % 20 % 10 / 5;
        divisao2 = valor % 200 % 100 % 50 % 20 % 10 % 5 / 2;
        divisao1 = valor % 200 % 100 % 50 % 20 % 10 % 5 % 2 / 1;
        resultado =  divisao200 + divisao100 + divisao50 + divisao20 + divisao10 + divisao5 + divisao2 + divisao1;

        //Saída
        String s = ("A quantidade de notas será de: " + resultado);
        JOptionPane.showMessageDialog(null, s);

    }
}
