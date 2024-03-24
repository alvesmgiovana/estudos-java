import javax.swing.JOptionPane;

public class Ternario {
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
        String msg = (idade >= 18) ? "Pode" + " dirigir." : "Não Pode" + " dirigir.";
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
