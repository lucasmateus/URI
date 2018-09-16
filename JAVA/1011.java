import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    double r;
    double pi=3.14159;
    Scanner leitor = new Scanner(System.in);
    r = leitor.nextInt();
    System.out.printf("VOLUME = "+"%.3f",(4/3.0)*pi*Math.pow(r,3));
    System.out.println();
  }
}
