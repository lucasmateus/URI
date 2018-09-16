import java.util.Scanner;
class Main {
  public static void main(String[] args) {
        int x = 60;
        int y = 90;
        Scanner leitor = new Scanner(System.in);
        int tempo = leitor.nextInt();
        y = tempo * 2;
        System.out.println(y + " " + "minutos");
  }
}
