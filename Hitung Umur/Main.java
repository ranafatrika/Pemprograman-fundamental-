import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Umur anda ");
        Scanner input = new Scanner(System.in);
        
        int tahun = input.nextInt();
        int umur = 2020 - tahun;
        System.out.println( umur + " tahun");

    }
}