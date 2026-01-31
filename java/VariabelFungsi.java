public class VariabelFungsi {
    // variabel global
    static String makanan = "Karedok";

    static void makes() {
        // ini variabel lokal
        String makanan = "Gado-Gado";
        // mengakses variabel makanan di dalam fungsi makes() (lokal)
        System.out.println("Makanan Kesukaan " + makanan);
    }

    public static void main(String args[]) {
        // panggil fungsi makes()
        makes();
        // mengakses variabel makanan global
        System.out.println("Makanan Lainnya : " + makanan);
    }
} 
