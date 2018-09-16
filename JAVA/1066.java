import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
 
        int x, par = 0,impar = 0,positivo = 0,negativo = 0;
		Scanner input =new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			x = input.nextInt();
			if (x % 2 == 0) {
				par += 1;
			}
			if (x % 2 != 0) {
				impar += 1;
			}
			if (x > 0) {
				positivo += 1;
			}
			if (x < 0) {
				negativo += 1;
			}
			
		}
		System.out.print(par+" valor(es) par(es)\n");
		System.out.print(impar+" valor(es) impar(es)\n");
		System.out.print(positivo+" valor(es) positivo(s)\n");
		System.out.print(negativo+" valor(es) negativo(s)\n");
 
    }
 
}
