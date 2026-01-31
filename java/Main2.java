import java.until.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = newScanner(System.in);
        System.out.print("Masukkan angka pertama:");
        int a = sc.nextInt();
        System.out.print("Masukkan angka edua:");
        int b = sc.nextInt();

        if(a>b)
            System.out.println(a+lebih besar dari"+b);
        else if(a<b)
            System.out.println(a+"lebih kecil dari"+b;
        else
            System.out.println("keduanya sama besar");
        
        System.out.println("Apakah keduanya sama?"+(a==b));

    }
}