import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num,num2,soma = 0;
    num = sc.nextInt();
    num2 = sc.nextInt();
    
    if(num>num2){
      for(int i=num2+1;i!=num;i++){
        if(i % 2 == 1 || i % 2 == -1){
          soma += i;
        }
      }
    }else if(num2>num){
      for(int i=num+1;i!=num2;i++){
        if(i % 2 == 1 || i % 2 == -1){
          soma += i;
        }
      }
    }
    System.out.println(soma);
  }
}
