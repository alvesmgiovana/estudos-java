import javax.swing.JOptionPane;

public class PrimeirosImparesFor {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        int nImp = 0; //número de vezes de imprimiu
        int numero = 1;

        System.err.println("\nCom While\n");

        while (nImp < n) {
            if (numero % 2 == 1){
                System.out.println(numero);
                nImp++;
            }
            numero++;
        }

        PrimeirosImparesFor(n);
    }

    public static void PrimeirosImparesFor(int n){
        System.err.println("\nCom For\n");
        for (int numero = 1; numero < 2*n; numero += 2){
            System.out.println(numero);
        }
    }
    
    
}
