import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    num = sc.nextInt();
    for (int j = num+1; j <= num+12; j++) {
      if (j % 2 == 1){
        System.out.println(j);
      }
    }
  }
}
