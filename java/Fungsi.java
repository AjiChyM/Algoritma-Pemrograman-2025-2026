public class Fungsi {

    public static void main(String[] args) {
        int alas = 5;
        int tinggi = 10;
        int luas = hitungLuas(alas, tinggi);
        //memanggil prosedur
        tampilkanHasil(luas);
    }

//fungsi
    static int hitungLuas(int a, int t) {
        int hasil = a * t;
        return hasil; 
    }
//prosedur
    static void tampilkanHasil(int hasilLuas) {
        System.out.println("===========================");
        System.out.println("Luas Persegi Panjang adalah: " + hasilLuas);
        System.out.println("===========================");
    }
}