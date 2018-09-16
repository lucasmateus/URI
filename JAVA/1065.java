import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] vetor = new int[5];
    int par = 0;
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = sc.nextInt();
    }
    for (int j = 0; j < vetor.length; j++) {
      if (vetor[j] % 2 == 0) {
        par += 1;
      }
    }
    System.out.println(par + " valores pares");
  }
}
