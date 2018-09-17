class Main {
  public static void main(String[] args) {
    for(int i=1,j=7; i<=9;i+=2,j+=2) {
      for(int b=j;b>=(j-2);b--) {
        System.out.println("I="+i+" J="+b);
      }
    }
  }
}
