import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		    Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int x,in=0,out=0;
		    for (int i = 0; i < n; i++) {
			    x = sc.nextInt();
			    if(x>=10 && x<=20){
            in += 1;
          }else out += 1;
		    }
		    System.out.print(in+" in\n"+out +" out\n");
    }
}
