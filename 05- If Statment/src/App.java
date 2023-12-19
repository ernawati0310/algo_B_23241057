import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        // Data member
        int Total_Belanja = 0;

        // Membuat Scenner Menerima Input Dari Keyboard
        Scanner scan = new Scanner (System.in);

        // Mengambil Input Dari Keybord
        System.out.print("Masukan Total Belanja: ");
        Total_Belanja = scan.nextInt();

        // Cek total belanja
        if (Total_Belanja >= 50000){
            System.out.println(" Anda Mendapatkan Mouse");

        } else  {
            System.out.println("Belanja Anda Kurang Dari RP.50000");
        }
        System.out.println("Terima Kasih Belanja di Toko Kami");

    }

}



