import java.util.Date;
public class FormatGabungan {
    public static void main(String args[])
    {
        String teks = "Jumlah Mahasiswa :";
        int jml = 20;
        Date tgl = new Date();
        System.out.printf("Tampilkan %S %d di hari %tA", teks,jml,tgl);
    }
}