import javax.swing.JOptionPane;

public class InteiraHipotenusa {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(" Digite um número inteiro: "));
        //a e b são catetos, c é a hipotenusa 

        for (int c = 1; c <= n; c++){
            for (int a = 1; a < c; a++){
                int b = a;
                while (a*a + b*b < c*c) {
                    b++;
                  }
                if (a*a + b*b == c*c){
                    System.out.println("cateto 1 = " + a + " cateto 2 = " + b + " hipotenusa = " + c);
                }
            }
        }
    }
    
}
