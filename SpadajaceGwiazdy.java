public class SpadajaceGwiazdy {
    public static void main(String[] args) {
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
    }
}

//for (int j = 1; j <= 14; j = j + 2) {
//        for (int i = 1; i < stars; i +=2) {
//        System.out.print(" ");
//        }
//        for (int i = 0; i < j; i++) {
//        System.out.print("*");
//        }
//        stars -= 2;
//        System.out.println();
//        }