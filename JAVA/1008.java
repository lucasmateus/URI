import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int a,b;
    double c;
    Scanner leitor = new Scanner(System.in);
    a = leitor.nextInt();
    b = leitor.nextInt();
    c = leitor.nextDouble();
    System.out.println("NUMBER = "+a);
    System.out.printf("SALARY = U$ "+"%.2f",b*c);
    System.out.println();
  }
}
