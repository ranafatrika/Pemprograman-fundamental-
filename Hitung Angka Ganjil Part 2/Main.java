import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
      int jumlah = 0;
      int r = keyboard.nextInt();
      int s = keyboard.nextInt();
      int[][]angka= new int[r][s];
        for(int i = 0; i< r; i++){
        for(int j = 0; j< s; j++){
          angka[i][j] = keyboard.nextInt();
        }
      }
      for(int i =0; i<r; i++){
      for(int j =0; j<s; j++){
        if(angka[i][j]%2!=0){
          
          jumlah++;
        }
      }
      System.out.println("" + jumlah);
      jumlah = 0;
    }
  }
}