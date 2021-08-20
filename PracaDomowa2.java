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
            System.out.println();
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
            System.out.println();
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
            System.out.println();
        }
        // Gwiazdki dla użytkownika
        System.out.println("Ile gwiazdek Ci wydrukowac"  + "(wpisz: 1000 aby zobaczyć spadające gwiazdy): ");
        int starMax = new Scanner(System.in).nextInt();
        try {
            if (starMax == 1000) {
                for (int j = 0; j < 2; j = j++) {
                    for (int i = 1; i < 13; i += 2) {
                        System.out.print(" ");
                    }
                    for (int i = 14; i > 13; i--) {
                        System.out.print("*");
                    }
                    for (int i = 1; i < 13; i++) {
                        System.out.print(" ");
                    }
                }
            } else {
                for (int i = 0; i <= starMax; i++) {
                    System.out.print("*");
                }
            }
        } catch (Exception e) {
            System.out.println("Niepoprawna wartość");
        }
    }
}
