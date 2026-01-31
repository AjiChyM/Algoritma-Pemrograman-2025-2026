public class DaftarAbsen {
    public static void main(String[] args) {
        
        String[] siswa = {"Ali", "Budi", "Cici", "Dedi"};

        System.out.println("=== DAFTAR ABSEN ===");

        
        for (int i = 0; i < siswa.length; i++) {
            System.out.println((i + 1) + ". " + siswa[i]);
        }
    }
}