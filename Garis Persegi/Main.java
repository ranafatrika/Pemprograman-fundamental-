import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    gambarPersegi();
  }
  
  public static void gambarPersegi() {
    Scanner input = new Scanner(System.in);
    int userInput = input.nextInt();

    for (int i = 0; i < userInput; i++) {
        for (int j = 0; j < userInput; j++) {
            if (i == 0 || i == userInput -1) {
                System.out.print("#");
            } else {
                if (j == 0 || j == userInput -1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }
  }
}