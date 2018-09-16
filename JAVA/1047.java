import java.util.Scanner;

public class Main {
 
 public static void main(String[] args) {
     int h1, h2, m1, m2, ht, mt;
     
     Scanner sc = new Scanner(System.in);
     
     h1 = sc.nextInt();
     m1 = sc.nextInt();
     h2 = sc.nextInt();
     m2 = sc.nextInt();
     
     ht = h2 - h1;

     if (ht < 0)
     {
         ht = 24 + (h2 - h1);
     }

  mt = m2 - m1;
  if (mt < 0)

   {
     mt = 60 + (m2 - m1);
     ht--;
   }

     if (h1 == h2 && m1 == m2)

     {
         System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
     }
     else 
      System.out.println("O JOGO DUROU "+ht+" HORA(S) E "+mt+ " MINUTO(S)");

 }

}
