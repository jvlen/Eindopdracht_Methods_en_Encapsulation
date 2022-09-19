import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef een natuurlijk getal:");
        int length = scanner.nextInt();
        if (length < 0 || length >= 40 ) {
            System.out.println("Dit getal is niet positief, of te groot.");
        } else {
            int first = 2;
            int second = 1;
            System.out.print(first + " ");
            System.out.print(second + " ");

            for (int number = 0; number < (length - 2); number++) {
                int solution = (first + second);
                System.out.print(solution + " ");
                first = second;
                second = solution;
            }
        }



    }
}
