import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int harga = input.nextInt();

      String result = String.format("%,d", harga).replace(",", ".");
      System.out.println("Rp" + result + ",-");
    }
}