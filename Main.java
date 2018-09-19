import java.util.Vector;
import java.util.Iterator;

class Main {
  public static void main(String[] args) {
    Arvore arv = new Arvore(1);
    System.out.println("Elemento raiz: "+arv.root().element());
    arv.addChild(arv.root(), 4);
    arv.addChild(v, o);
    Iterator it = arv.elements();
    Iterator its = arv.Nos();
    System.out.println("elementos da Arvore:");
    while(it.hasNext())
      System.out.println(it.next());
    System.out.println("elementos da Arvore pelo nó:");
    while(its.hasNext())
      System.out.println( ((No) its.next()).element());
  }
}
