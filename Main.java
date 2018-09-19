import java.util.Vector;
import java.util.Iterator;

class Main {
  public static void main(String[] args) {
    Arvore arv = new Arvore(1);
    System.out.println("Elemento raiz: "+arv.root().element());
    arv.addChild(arv.root(), 4);
    Iterator<No> segundaGeração = arv.root().children();
    arv.addChild(segundaGeração.next(), 6);
    Iterator it = arv.elements();
    Iterator<No> its = arv.Nos();
    System.out.println("elementos da Arvore:");
    while(it.hasNext())
      System.out.println(it.next());
    System.out.println("elementos da Arvore pelo nó:");
    while(its.hasNext())
      System.out.println(its.next().element());
    System.out.println("Tamanho da Arvore: "+arv.height(arv.root()));
  }
}
