import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Integer.parseInt;
import static java.lang.String.format;
import static javax.swing.JOptionPane.showMessageDialog;
public class Ex2 {
    public static void main(String[] args){
        int n;
        do{
            n = parseInt(showInputDialog("Digite o valor de n. OBS: Tem que ser positivo!"));
        }while(n <= 0);
        
        for(int cont = 1; cont <= n; cont++){
            int b, h;
            do{
            b = parseInt(showInputDialog("Digite o valor da base: "));
            }while(b <= 0);
            
            do{
                h = parseInt(showInputDialog("Digite o valor da altura: "));
            }while(h <= 0);

            showMessageDialog(null, format("%dm x %dm = %dm\u00B2", b, h, b * h));
        }
    }
}