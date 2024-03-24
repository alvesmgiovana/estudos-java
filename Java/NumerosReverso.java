public class NumerosReverso {
    public static void main(String[] args) {
        System.out.println("\nFor\n");
        for (int n = 100; n >= 1; n--){
            System.out.println(n);
        }

        System.out.println("\nWhile\n");
        int i = 100;

        while (i >= 1){
            System.out.println(i--);
        }

        System.out.println("\nDo While\n");

        int y = 100;

        do {
            System.out.println(y--);
        } while (y >= 1);
    }
}
