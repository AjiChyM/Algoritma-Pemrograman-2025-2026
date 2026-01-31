public class PerulanganBersarang {
    public static void main(String[] args) {
        int row;
        int maks_row = 10;
        int star;
        
        // Loop luar untuk baris
        for (row = 1; row < maks_row; row++) {
            // Loop dalam untuk mencetak bintang
            for (star = 1; star <= row; star++) {
                System.out.print("*");
            }
            // Pindah ke baris baru setelah loop dalam selesai
            System.out.println();
        }
    }
}