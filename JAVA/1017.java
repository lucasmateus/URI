import java.util.Scanner;
class Main {
  public static void main(String[] args) {
        int a,b;
        double c;
        Scanner leitor = new Scanner(System.in);
        a = leitor.nextInt();
        b = leitor.nextInt();
        c = a*b;
        System.out.printf("%.3f\n",c/12);
  }
}
