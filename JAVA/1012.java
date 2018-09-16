import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    double a,b,c;
    Scanner leitor = new Scanner(System.in);
    a = leitor.nextDouble();
    b = leitor.nextDouble();
    c = leitor.nextDouble();
    System.out.printf("TRIANGULO: %.3f\n", (a * c) / 2);
    System.out.printf("CIRCULO: %.3f\n", c * c * 3.14159);
    System.out.printf("TRAPEZIO: %.3f\n", ((a + b) / 2) * c);
    System.out.printf("QUADRADO: %.3f\n", b * b);
    System.out.printf("RETANGULO: %.3f\n", a * b);
  }
}
