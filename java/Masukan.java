import java.util.Scanner;

public class Masukan {
    public static void main(String[] args) {

    Scanner masukan = new Scanner(System.in);
    String nama;

    System.out.println("Masukkan nama Anda");
    nama = masukan.next();

    System.out.println("Selamat Datang, " + nama);
    }
}