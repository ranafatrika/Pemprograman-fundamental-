import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    matriks();
  }
  
  public static void matriks() {
    Scanner input = new Scanner(System.in);
    int userInput = input.nextInt();

    for (int i = 0; i < userInput; i++) {
        for (int j = 0; j < userInput; j++) {
            System.out.print(j);
        }
        System.out.println();
    }
  }
}