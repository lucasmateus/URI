import java.util.Iterator;
import java.util.Vector;
import java.lang.Math;
public class Arvore
{
	//Atributos da arvore
	  No raiz;
    int tamanho;
	//Construtor
	public Arvore(Object o)
	{
		raiz = new No(null, o);
        tamanho = 1;
	}
	/** Retorna a raiz da arvore */
	public No root()
	{
		return raiz;
	}
	/** Retorna o no pai de um no */
	public No parent(No v)
	{
		return (v.parent());
	}

	/** retorna os filhos de um no */
	public Iterator children(No v)
	{
		return v.children();
	}
	/** Testa se um no o interno */
	public boolean isInternal(No v)
	{
		return (v.childrenNumber() > 0);
	}
	/** Testa se um no o externo*/
	public boolean isExternal(No v)
	{
		return (v.childrenNumber() == 0);
	}
	/** Testa se um no o a raiz */
	public boolean isRoot(No v)
	{
		return v == raiz;
	}
	/** Adiciona um filho a um no */
	public void addChild(No v, Object o)
	{
		No novo = new No(v, o);
		v.addChild(novo);
		tamanho++;
	}
	/** Remove um no
	 *  S� pode remover n�s externos e que tenham um pai (n�o seja raiz)
	*/
	public Object remove(No v) throws IndexOutOfBoundsException
	{
		No pai = v.parent();
		if (pai != null || isExternal(v))
			pai.removeChild(v);
		else
			throw new IndexOutOfBoundsException();
		Object o = v.element();
		tamanho--;
		return o;
	}
	/** Troca dois elementos de posi��o */
	public void swapElements(No v, No w)
	{
		Object o = v.element();
        v.setElement(w.element());
        w.setElement(o);
	}
	/** Retorna a profundidade de um n� */
	public int depth(No v)
	{
		int profundidade = profundidade(v);
		return profundidade;
	}
	private int profundidade(No v)
	{
		if (v == raiz)
			return 0;
		else
			return 1 + profundidade(v.parent());
	}
	/** Retorna a altura da �rvore */
	public int height(No v){
		// M�todo que serve de exerc�cio
    if(isExternal(v)){//Se o nó nao tem filhos não tem altura
      return 0;
    }
    int h=0;
    Iterator ite = v.children(); //passamos todos os filhos do nó V para o iterator
    while(ite.hasNext()){//enquanto existir filhos
        h = Math.max(h,height((No) ite.next()));//a altura vai ser o maximo da recursividade da função height() de todos os filhos
    }
		return h+1;//a altura é o resultado da função max + 1
	}
	public void preOrderElement(Vector e,No v){
		e.add(v.element());//adiciona o elemento do no para o vector
		Iterator<No> w = v.children();// Interator vai receber todos os filhos do nó v
		while(w.hasNext())//Enquanto tiver filho
			preOrderElement(e, w.next());//chama a função com o proximo filho
	}
	public void preOrderNo(Vector e,No v){
		e.add(v);//adiciona o no para o vector
		Iterator<No> w = v.children(); // Interator vai receber todos os filhos do nó v
		while(w.hasNext())//Enquanto tiver filho
			preOrderNo(e, w.next());//chama a função com o proximo filho
	}
	/** Retorna um iterator com os elementos armazenados na �rvore */
	public Iterator elements()
	{
        	Vector v = new Vector<Object>();//Criamos um vetor de objetos ja que queremos os elementos dos nós
        	preOrderElement(v, raiz);//chamamos a função preOrder para ordenar
		return v.iterator();//retornamos o iterator com os elementos da arvore
	}
	/** Retorna um iterator com as posi��es (n�s) da �rvore */
	public Iterator Nos()
	{
		Vector v = new Vector<No>();//Criamos um vetor de Nós ja que queremos os nós
        	preOrderNo(v, raiz);//Ordenamos
		return v.iterator();//retornamos o iterator do vetor de nós
	}
	/** Retorna o n�mero de n�s da �rvore
	 */
	public int size()
	{
		return tamanho;
	}
	/** Retorna se a �vore est� vazia. Sempre vai ser falso, pois n�o permitimos remover a raiz
	 */
	public boolean isEmpty()
	{
		return false;
	}
	public Object replace(No v, Object o)
	{
        Object temp = v.element();
        v.setElement(o);
		return temp;
	}
	
}
