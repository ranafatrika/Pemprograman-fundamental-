import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int userInput = input.nextInt();
    
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
    
    if (userInput >=1 && userInput<=12) {
        for (int i = userInput; i <= userInput; i++ ) {
          System.out.println(namaBulan[i-1]);
        }
    } else {
        System.out.println("nomor tidak valid");
    }
    
  }
}