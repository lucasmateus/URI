import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int a,b,c,d;
    Scanner leitor = new Scanner(System.in);
    a = leitor.nextInt();
    b = leitor.nextInt();
    c = leitor.nextInt();
    d = leitor.nextInt();
    System.out.println("DIFERENCA = "+(a*b-c*d));
  }
}
