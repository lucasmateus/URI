import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    double x1,x2,y1,y2;
    Scanner leitor = new Scanner(System.in);
    x1 = leitor.nextDouble();
    y1 = leitor.nextDouble();
    x2 = leitor.nextDouble();
    y2 = leitor.nextDouble();
    System.out.printf("%.4f\n",Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));
  }
}
