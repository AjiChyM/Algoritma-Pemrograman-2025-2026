public class pattern1 { 
    public static void main(String[] args) {
        int baris = 5;

        System.out.println("--- Pola Segitiga ---");

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}