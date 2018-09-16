import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double a, b,c,d;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d=((a*2)+(b*3)+(c*5))/10;
        System.out.printf("MEDIA = "+"%.1f",d);
        System.out.println();
  }
}
