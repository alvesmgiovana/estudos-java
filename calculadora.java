import javax.swing.JOptionPane;

public class Calculadora {
    double a = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor: "));
    double b = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo valor: "));

    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        return a / b;
    }
}