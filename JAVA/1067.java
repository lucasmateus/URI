import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    num = sc.nextInt();
    for (int j = 1; j <= num; j++) {
      if (j % 2 == 1){
        System.out.println(j);
      }
    }
  }
}
