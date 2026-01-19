public class pattern3 {
    public static void main(String[] args) {
        int baris = 5;

        System.out.println("--- Pola Diamond (Belah Ketupat) ---");

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= baris - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = baris - 1; i >= 1; i--) {
            for (int j = 1; j <= baris - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}