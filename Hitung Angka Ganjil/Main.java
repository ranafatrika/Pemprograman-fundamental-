import java.util.Scanner;
class Main {
  
  public static void main(String[] args){
    
    Scanner r = new Scanner(System.in);
  
  int jumlah = 0;
  int[]angka = new int[10];
  for(int i=0; i<angka.length; i++){
    
    try{
      
      angka[i]=r.nextInt();
        if(angka[i]%2!=0){
          
          jumlah++;
        }
    }catch(Exception exception){
      break;
    }
    }
    System.out.print("");
      System.out.print("" + jumlah);
  }
}