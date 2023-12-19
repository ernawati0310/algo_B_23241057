import java.uti.Scanner;

class BanyakIF {

    public static void main(String[] Args){

        // Data Member
        int nilai;
        String garde;

        //membuat objek Scanner
        Scanner Scan = new Scanner (System.in);

        // Memasukan Input dari keyboard
        System.out.println("Masukan Nilai : ");
        nilai = scan.nextInt();

        // IF Statment
        if (nilai >= 80 && nilai <= 89) {
            garde = "A";
        }  else if (nilai >= 70 && nilai <= 79 ) { 
             garde = "B";
        } else if (nilai >= 60 && nilai <= 69 ) {
              garde = "C"; 
        } else if (nilai >= 50 && nilai <= 59 ) {
              garde = "D";
        } else {
              garde = "E";
        }
        System.out.println("nilai: " + nilai);
        System.out.println("garde: " + garde);

    }

}



    

 
