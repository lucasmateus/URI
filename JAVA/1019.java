import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        
        System.out.println(a/3600 +":"+ (a%3600)/60 +":"+ a%60);
    }
 
}
