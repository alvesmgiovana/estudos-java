import javax.swing.JOptionPane;

public class For {
    public static void main(String[] args) {
        double nota1, nota2;
        for (int contador= 1; contador <= 5; contador = contador + 1){
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1: "));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2: "));

            double media = (nota1 + nota2)/2;
            JOptionPane.showMessageDialog(null, "Média: " + media + (media>=70 ?"\nAprovado" : "\nReprovado"));
        } 
    }   
}