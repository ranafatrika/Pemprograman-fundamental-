import java.util.Scanner;

class Main {
  public static void main(String[] args) {
Scanner input = new Scanner(System.in);
  
    
    String[] namaBulan = {
                "Januari",
                "Februari",
                "Maret",
                "April",
                "Mei",
                "Juni",
                "Juli",
                "Agustus",
                "September",
                "Oktober",
                "November",
                "Desember",
    };
    
    int tanggal = input.nextInt();
    int nomorBulan = input.nextInt();
    int tahun = input.nextInt();
    
    System.out.print(tanggal + namaBulan[nomorBulan - 1] + tahun);
    
  }
}