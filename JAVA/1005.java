import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double a, b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c=((a*3.5)+(b*7.5))/11;
        System.out.printf("MEDIA = "+"%.5f",c);
        System.out.println();
  }
}
