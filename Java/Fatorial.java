import javax.swing.JOptionPane;

public class Fatorial {
    public static void main(String[] args) {
        double fatorial = Double.parseDouble(JOptionPane.showInputDialog("Escreva um número: "));
        double resultado = 1.0;

        for (double x = 1; x <= fatorial; x++){
            resultado *= x;
        }

        JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
    }
}
