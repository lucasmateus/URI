import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		    Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int [] x = new int[n];
		    for (int i = 0; i < n; i++) {
			    x[i] = sc.nextInt();
		    }
        for(int i = 0; i<n;i++){
          if(x[i] % 2 == 0 && x[i] > 0)System.out.println("EVEN POSITIVE");
          if(x[i] % 2 == 0 && x[i] < 0)System.out.println("EVEN NEGATIVE");
          if(x[i] % 2 == 1 && x[i] > 0)System.out.println("ODD POSITIVE");
          if(x[i] % 2 == -1 && x[i] < 0)System.out.println("ODD NEGATIVE");
          if(x[i] == 0)System.out.println("NULL");
        }  
    }
}
