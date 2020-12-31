import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int value = input.nextInt();

    if ((value % 2) == 0) {
        System.out.println("Genap");
    } else {
        System.out.println("Ganjil");
    }
  }
}