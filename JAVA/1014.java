import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int a;
    double b;
    Scanner leitor = new Scanner(System.in);
    a = leitor.nextInt();
    b = leitor.nextDouble();
    System.out.printf("%.3f"+" km/l\n",a/b);
  }
}
