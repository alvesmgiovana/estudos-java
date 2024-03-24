import javax.swing.JOptionPane;

public class Pim {
    public static void main(String[] args) {

        for (int x = 1; x <= 40; x++) {
            if (x % 4 == 0 || x % 10 == 0) { //isso ou isso
                System.err.println("PIM");
            } else {
                System.err.println(x);
            }
        }
    }
}
