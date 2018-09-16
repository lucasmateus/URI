import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int a1,a2,b1,b2;
    double c1,c2;
    Scanner leitor = new Scanner(System.in);
    a1 = leitor.nextInt();
    b1 = leitor.nextInt();
    c1 = leitor.nextDouble();
    a2 = leitor.nextInt();
    b2 = leitor.nextInt();
    c2 = leitor.nextDouble();
    System.out.printf("VALOR A PAGAR: R$ "+"%.2f",(b1*c1)+(b2*c2));
    System.out.println();
  }
}
