import javax.swing.JOptionPane;

public class Exercicio4{
    static public void main(String args []){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 1 a 7: "));
        switch (n){
            case 1:
                JOptionPane.showMessageDialog(null, "Domingo");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Segunda-Feira");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Terça-Feira");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Quarta-Feira");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Quinta-Feira");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Sexta-Feira");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Sábado");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Apenas números de 1 a 7! ");
                break;
        }
        
        //saida
        JOptionPane.showMessageDialog(null, "Tenha um bom dia :)");
    }
}