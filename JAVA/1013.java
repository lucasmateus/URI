import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int a,b,c;
    Scanner leitor = new Scanner(System.in);
    a = leitor.nextInt();
    b = leitor.nextInt();
    c = leitor.nextInt();
    int ab = (a+b+Math.abs(a-b))/2;
    int abc = (ab+c+Math.abs(ab-c))/2;
    System.out.println(abc+ " eh o maior");
  }
}
