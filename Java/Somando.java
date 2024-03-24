import javax.swing.JOptionPane;

public class Somando {
    public static void main(String[] args) {
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Escreva um número: "));

        if (numero >= 20 && numero <= 90){
            JOptionPane.showMessageDialog(null,"Sim");
        } else {
            JOptionPane.showMessageDialog(null, "Não");
        }
    }
}
