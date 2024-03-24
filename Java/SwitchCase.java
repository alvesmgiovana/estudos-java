import javax.swing.JOptionPane;

public class SwitchCase {
    public static void main(String[] args) {
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Escreva a nota:"));
        switch (nota) {
            case 10:
                JOptionPane.showMessageDialog(null, "Parabéns");
            case 9:
                JOptionPane.showMessageDialog(null, "Conceito A");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Conceito B");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Conceito C");
            default: // caso contrário
                JOptionPane.showMessageDialog(null, "Reprovado");
                break;
        }
    }
}
