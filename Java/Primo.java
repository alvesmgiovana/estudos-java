import java.util.Scanner;

import javax.swing.JOptionPane;

public class Primo {
    public static void main(String[] args) {
        int primo = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
        boolean ehprimo = true;
        for (int x = 2; x < primo; x++){
            if (primo % x == 0){
                ehprimo = false;
            }
        }

        if (ehprimo){
            JOptionPane.showMessageDialog(null, "É primo.");
        } else {
            JOptionPane.showMessageDialog(null, "Não é primo.");
        }
    }
}
