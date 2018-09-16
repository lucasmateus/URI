import java.util.Scanner;
class Main {
  public static void main(String[] args) {
     Scanner leitor = new Scanner(System.in);
        int inicio = leitor.nextInt();
        int fim = leitor.nextInt();
        if (fim <= inicio) {
            System.out.println("O JOGO DUROU " + (24-(inicio - fim)) + " HORA(S)");
        } else {
            System.out.println("O JOGO DUROU "+(fim - inicio)+ " HORA(S)" );
        }
  }
}
