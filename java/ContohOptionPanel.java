import javax.swing.*;
public class ContohOptionPanel {
    public static void main(String[] args) {
            JFrame kotak;
            kotak=new JFrame();
            String name = JOptionPane.showInputDialog(kotak,"Masukkan Nama Anda");
            JOptionPane.showMessageDialog(kotak,"Selamat Datang, "+name);
         }
}