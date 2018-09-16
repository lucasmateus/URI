import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n,numero,ratos=0,coelhos=0,sapos=0,total=0;
    float percentC,percentR,percentS;
    String string;
    n = sc.nextInt();
    for(int i=0; i<n;i++){
      numero = Integer.parseInt(sc.next());
      string = sc.next();
      if(string.equals("C")){
        coelhos += numero;
      }
      if(string.equals("R")){
        ratos += numero;
      }
      if(string.equals("S")){
        sapos += numero;
      }
      total+=numero;
    }
    percentC = (float) coelhos/total*100;
    percentR = (float) ratos/total*100;
    percentS = (float) sapos/total*100;
    System.out.println("Total: "+total+" cobaias");
    System.out.println("Total de coelhos: "+coelhos);
    System.out.println("Total de ratos: "+ratos);
    System.out.println("Total de sapos: "+sapos);
    System.out.printf("Percentual de coelhos: %.2f",percentC);
		System.out.print(" %\n");
		System.out.printf("Percentual de ratos: %.2f",percentR);
		System.out.print(" %\n");
		System.out.printf("Percentual de sapos: %.2f",percentS);
		System.out.print(" %\n");
  }
}
