import javax.swing.JOptionPane;

public class PrimeirosImpares {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        int nImp = 0; //número de vezes de imprimiu
        int numero = 1;

        while (nImp < n) {
            if (numero % 2 == 1){
                System.out.println(numero);
                nImp++;
            }
            numero++;
        }
    }
}
