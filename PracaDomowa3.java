public class PracaDomowa3 {
    public static void main(String[] args) {
        int [] tab = new int[8];
        int randomNum = 0;
        for (int i = 0; i < tab.length; i++) {
            randomNum = (int)(Math.random() * 10);
            tab[i] = randomNum;
            System.out.print(tab[i] + ", ");
        }
        int maxTab = tab[0];
        int minTab = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > maxTab) {
                maxTab = tab[i];
            } else if (tab[i] < minTab) {
                minTab = tab[i];
            }
        }
        System.out.println("Największy elelemt to: " + maxTab);
        System.out.println("Najmniejszy element to: " + minTab);
    }
}
