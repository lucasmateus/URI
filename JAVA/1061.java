import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String string;
    int dia_i, hora_i, min_i, seg_i, dia_f, hora_f, min_f, seg_f;
    int dias = 0, horas = 0, minutos = 0, segundos = 0;
    string = sc.next();
    dia_i = sc.nextInt();
    hora_i = sc.nextInt();
    string = sc.next();
    min_i = sc.nextInt();
    string = sc.next();
    seg_i = sc.nextInt();
    string = sc.next();
    dia_f = sc.nextInt();
    hora_f = sc.nextInt();
    string = sc.next();
    min_f = sc.nextInt();
    string = sc.next();
    seg_f = sc.nextInt();

    // Pulo do gato
    if (hora_i > hora_f) {
      dias--;
    }
    if (min_i > min_f) {
      horas--;
    }
    if (seg_i > seg_f) {
      minutos--;
    }
    //----------------------------------
    while (dia_i != dia_f) {
      dias++;
      dia_i++;
    }
    while (hora_i != hora_f) {
      horas++;
      hora_i++;
      if (hora_i == 25) {
        hora_i = 1;
      }
    }
    while (min_i != min_f) {
      minutos++;
      min_i++;
      if (min_i == 61) {
        min_i = 1;
      }
    }
    while (seg_i != seg_f) {
      segundos++;
      seg_i++;
      if (seg_i == 61) {
        seg_i = 1;
      }
    }
    System.out.print(dias + " dia(s)\n");
    System.out.print(horas + " hora(s)\n");
    System.out.print(minutos + " minuto(s)\n");
    System.out.print(segundos + " segundo(s)\n");
  }
}