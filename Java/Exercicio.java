import javax.swing.JOptionPane;

public class Exercicio {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        switch (num) {
            case 20:
                JOptionPane.showMessageDialog(null, "O número é igual a 20.");
                break;
            default:
                if (num > 20){
                    JOptionPane.showMessageDialog(null, "O número é maior que 20.");
                } else {
                    JOptionPane.showMessageDialog(null, "O número é menor que 20.");
                }
                break;
        }
    }
}
