import java.util.Scanner;

public class PracaDomowa2 {
    public static void main(String[] args) {
        int stars = 13;
        // Choinka
        for (int j = 0; j < stars; j = j++) {
            for (int i = 1; i < stars; i += 2) {
                System.out.print(" ");
            }
            for (int i = 14; i > stars; i--) {
                System.out.print("*");
            }
            for (int i = 1; i < stars; i++) {
                System.out.print(" ");
            }
            stars -= 2;
            System.out.println("");
        }
        // Diamencik
        stars = 13;
        for (int j = 0; j < stars; j = j++) {
            for (int i = 1; i < stars; i += 2) {
                System.out.print(" ");
            }
            for (int i = 14; i > stars; i--) {
                System.out.print("*");
            }
            for (int i = 1; i < stars; i++) {
                System.out.print(" ");
            }
            stars -= 2;
            System.out.println("");
        }
        stars = 11;
        for (int j = 0; j < stars; j = j++) {
            for (int i = 13; i > stars; i -= 2) {
                System.out.print(" ");
            }
            for (int i = 0; i < stars; i++) {
                System.out.print("*");
            }
            for (int i = 14; i > stars; i--) {
                System.out.print(" ");
            }
            stars -= 2;
            System.out.println("");
        }
        System.out.println("Ile gwiazdek Ci wydrukowac: ");
        Scanner starMax = new Scanner(System.in);
        try {
            for (int i = 14; i > starMax.nextInt(); i--) {
                System.out.print("*");
            }
        } catch (Exception e) {
            System.out.println("Niepoprawna wartość");
        }
    }
}
