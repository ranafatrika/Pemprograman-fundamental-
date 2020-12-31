import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    pilihJurusan();
  }
  
  private static void pilihJurusan() {
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        switch (userInput) {
            case 1 :
                String jurusan1 = "Teknik Informatika";
                System.out.println("Selamat datang di jurusan " + jurusan1);
                break;
            case 2 :
                String jurusan2 = "Sistem Informasi";
                System.out.println("Selamat datang di jurusan " + jurusan2);
                break;
            case 3 :
                String jurusan3 = "Teknik Elektro";
                System.out.println("Selamat datang di jurusan " + jurusan3);
                break;
            case 4 :
                String jurusan4 = "Teknik Industri";
                System.out.println("Selamat datang di jurusan " + jurusan4);
                break;
            case 5 :
                String jurusan5 = "Matematika Terapan";
                System.out.println("Selamat datang di jurusan " + jurusan5);
                break;
        }

    }
}