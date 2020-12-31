import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    arrayTerbalikdua();
  }
  
  public static void arrayTerbalikdua() {
    Scanner input = new Scanner(System.in);
    int panjangArray = input.nextInt();
    int array[] = new int[panjangArray];

    // memasukkan data ke array
    for (int i = 0; i < array.length; i++){
        array[i] = input.nextInt();
    }

    // mengcopy array
    int[] arrayTemp = Arrays.copyOf(array, array.length);

    // reverse dan menampilkan aaray
    for (int i = 0; i < array.length; i++) {
        array[i] = arrayTemp[(arrayTemp.length - 1) - i];

        System.out.print(array[i]);
    }
  }
}