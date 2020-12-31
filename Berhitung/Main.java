import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    berhitung();
  }
  
  public static void berhitung() {
    Scanner input = new Scanner(System.in);
    int userInput = input.nextInt();
    
    for (int i = 0; i < userInput; i++) {
        System.out.println(i+1);
    }
  }
}