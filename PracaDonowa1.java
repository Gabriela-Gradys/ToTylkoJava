import java.util.Scanner;

public class PracaDonowa1 {
    public static void main(String[] args) {
        Scanner wprowadz = new Scanner(System.in);
        System.out.println("Wprowadź swój wiek:");
        try {
            int wiek = wprowadz.nextInt();
            if (wiek > 60) {
                System.out.println("Jesteś w starszym wieku");
            } else if (wiek > 30) {
                System.out.println("Jesteś w średnim wieku");
            } else if (wiek > 18) {
                System.out.println("Jesteś w młodym wieku");
            } else if (wiek <18) {
                System.out.println("Jesteś dzieckiem");
            }
        } catch (Exception e){
            System.out.println("Niepoprawna wartość");
        }
    }
}
