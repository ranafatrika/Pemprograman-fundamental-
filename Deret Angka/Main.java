import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    deretAngka();
  }
  
  public static void deretAngka() {
    Scanner input = new Scanner(System.in);
    int userInput = input.nextInt();

    for (int i = 0; i < userInput; i++) {
        System.out.println(i);
    }
  }
}