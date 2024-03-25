import javax.swing.JOptionPane;

public class calculadora {
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

    public String operacao(double a, double b) {
        String tipo = JOptionPane.showInputDialog("Escolha qual operação deseja realizar: ");

        switch (tipo) {
            case "Som":
                somar(a, b);
                break;
            case "Sub":
                subtrair(a, b);
                break;
            case "Mult":
                multiplicar(a, b);
                break;
            case "Div":
                dividir(a, b);
                break;
            default:
                break;
        }

        return "Fim";
    }
}