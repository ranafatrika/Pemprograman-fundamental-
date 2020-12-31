class Main {
  static int ujian(int[] data){
    if(data == null || data.length ==0){
      return 0;
    }
    int n = data.length;
    int[] dp = new int [n];
    int max = 0;
    
    for (int i = 0; i < n;i++){
      for (int j = 0; j < i;j++){
        if(data[i] > data[j]){
          dp[i] =Math.max(dp[i], dp[j] +1);
        }
      }
      max = Math.max(dp[i], max);
    }
    return max + 1;
  }
public static void main(String[] args){
  int[] data = {4, 2, 3, 3, 2, 4, 6, 7, 3, 9};
  System.out.print(ujian(data));
  }
}