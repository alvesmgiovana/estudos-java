import javax.swing.JOptionPane;

public class SequenciaQuadrados {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));

        for (int x = 1; x <= n; x++){
            //int quadrado = x * x;
            System.err.println("O quadrado de " + x + " é: " + Math.pow(x, 2));
        }
    }
}
