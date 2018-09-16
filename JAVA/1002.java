import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    double pi=3.14159,area;
    Scanner leitor = new Scanner(System.in);
    double raio = leitor.nextDouble();
    area = pi*(raio*raio);
    System.out.printf("A="+"%.4f",area);
    System.out.println();
  }
}
