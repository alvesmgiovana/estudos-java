public class Numeros {
    public static void main(String[] args) {
        System.out.println("\nFor\n");
        for (int n = 1; n <= 100; n++){
            System.out.println(n);
        }

        System.out.println("\nWhile\n");
        int i = 1;

        while (i <= 100){
            System.out.println(i++);
        }

        System.out.println("\nDo While\n");

        int y = 1;

        do {
            System.out.println(y++);
        } while (y <= 100);
    }
}
