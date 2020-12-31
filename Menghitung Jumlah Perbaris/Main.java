import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int i, j, m, n;
    int data[][]= new int[10][10];
    int hasil[][]= new int[10][10];
    Scanner input = new Scanner(System.in);
    m =5;
    n =5;
    for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++) {
       data[i][j] = input.nextInt();
      
      }
    }
  
   
          System.out.println(data[0][0] + data[0][1] + data[0][2] + data[0][3] + data[0][4]);
          System.out.println(data[1][0] + data[1][1] + data[1][2] + data[1][3] + data[1][4]);
          System.out.println(data[2][0] + data[2][1] + data[2][2] + data[2][3] + data[2][4]);
          System.out.println(data[3][0] + data[3][1] + data[3][2] + data[3][3] + data[3][4]);
          System.out.println(data[4][0] + data[4][1] + data[4][2] + data[4][3] + data[4][4]);
      
  }
}