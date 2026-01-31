import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VolumeLimasSegitiga {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(
                new InputStreamReader(System.in)
        );

        double Lalas, t, v;

        System.out.println("=== Menghitung Volume Limas Segi Empat ===");

        System.out.print("Masukkan nilai L alas (luas alas) : ");
        Lalas = Double.parseDouble(input.readLine());

        System.out.print("Masukkan nilai t (tinggi limas segi empat) : ");
        t = Double.parseDouble(input.readLine());

        v = 1.0 / 3.0 * Lalas * t;

        System.out.println("Volume Limas Segi Empat : " + v);
    }
}