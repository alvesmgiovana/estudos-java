public class Fatoracao {
    public static void main(String[] args) {

        double resultado = 0;

        for(double x = 1; x < 10000; x = x + 2){
            double fracao1 = 1 / x;
            double fracao2 = 1 / (x+1);

            resultado += fracao1 - fracao2;
        }

        System.out.println(resultado);
    }
}
