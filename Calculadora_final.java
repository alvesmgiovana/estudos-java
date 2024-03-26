import javax.swing.JOptionPane;

public class Calculadora_final {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        double a = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo valor: "));

        double som = calc.somar(a, b);
        System.out.println(som);

        double sub = calc.subtrair(a, b);
        System.out.println(sub);

        double mult = calc.multiplicar(a, b);
        System.out.println(mult);

        double div = calc.dividir(a, b);
        System.out.println(div);
    }
}
