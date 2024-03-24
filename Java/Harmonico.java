import javax.swing.JOptionPane;

public class Harmonico {
    public static void main(String[] args) {
        double n = Double.parseDouble(JOptionPane.showInputDialog("Escreva um número: "));
        double soma = 0.0;

        for (double k = 1; k <= n; k++){
            soma = soma + 1/k;
        }

        System.out.println(soma);
    }
}