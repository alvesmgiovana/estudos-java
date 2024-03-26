public class Calculadora_final {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        double som = calc.somar(10, 5);
        System.out.println(som);

        double sub = calc.subtrair(10, 5);
        System.out.println(sub);

        double mult = calc.multiplicar(10, 5);
        System.out.println(mult);

        double div = calc.dividir(10, 5);
        System.out.println(div);
    }
}
