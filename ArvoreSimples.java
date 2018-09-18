import java.util.Iterator;
import java.util.Vector;
public class ArvoreSimples implements ArvoreGenerica
{
	//Atributos da árvore
	No raiz;
	int tamanho;
	//Construtor
	public ArvoreSimples(Object o)//Construtor
	{
		raiz = new No(null, o);//raiz não tem pai
		tamanho = 1;
	}
	/** Retorna a raiz da árvore */
	public No root()
	{
		return raiz;
	}
	/** Retorna o nó pai de um nó */
	public No parent(No v)
	{
		return (v.parent());//pai do nó
	}

	/** retorna os filhos de um nó */
	public Iterator children(No v)
	{
		return v.children();
	}
	/** Testa se um nó é interno */
	public boolean isInternal(No v)
	{
		return (v.childrenNumber() > 0);
	}
	/** Testa se um nó é externo*/
	public boolean isExternal(No v)
	{
		return (v.childrenNumber() == 0);
	}
	/** Testa se um nó é a raiz */
	public boolean isRoot(No v)
	{
		return v == raiz;
	}
	/** Adiciona um filho a um nó */
	public void addChild(No v, Object o)
	{
		No novo = new No(v, o);
		v.addChild(novo);
		tamanho++;
	}
	/** Remove um nó
	 *  Só pode remover nós externos e que tenham um pai (não seja raiz)
	*/
	public Object remove(No v) throws InvalidNóException
	{
		No pai = v.parent();
		if (pai != null || isExternal(v))
			pai.removeChild(v);
		else
			throw new InvalidNóException();
		Object o = v.element();
		tamanho--;
		return o;
	}
	/** Troca dois elementos de posição */
	public void swapElements(No v, No w)
	{
		/*Método que serve de exercício
		 * Este método deverá fazer com que o objeto
		 * que estava na posição v fique na posição w
		 * e fazer com que o objeto que estava na posição w
		 * fique na posição v
		 */  
		Object novo = new Object();
		novo = v.element();
		v.setElement(w.element());
		w.setElement(novo);		
	}
	/** Retorna a profundidade de um nó */
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
	/** Retorna a altura da árvore */
	public int height()
	{
		// Método que serve de exercício
		int altura = 0;
		return altura;
	}
	/** Retorna um iterator com os elementos armazenados na árvore */
	public Iterator elements()
	{
		// Método não implementados --- Coleguinha fique a vontade para fazê-los
		return null;
	}
	/** Retorna um iterator com as posições (nós) da árvore */
	public Iterator Nos()
	{
		// Método não implementados --- Coleguinha fique a vontade para fazê-los
		return null;
	}
	/** Retorna o número de nós da árvore
	 */
	public int size()
	{
		return this.tamanho;
	}
	/** Retorna se a ávore está vazia. Sempre vai ser falso, pois não permitimos remover a raiz
	 */
	public boolean isEmpty()
	{
		return false;
	}
	public Object replace(No v, Object o)
	{
		// Método de exercício
		Object antigoElemento = v.element();
		v.setElement(o);
		return antigoElemento;
	}
	/* Início da classe aninhada para armazenar o nó*/
	private class No
	{
		private Object o;
		private No pai;
		private Vector filhos = new Vector();
		public No(No pai, Object o)
		{
			this.pai = pai;
			this.o = o;
		}
		public Object element()
		{
			return this.o;
		}
		public No parent()
		{
			return this.pai;
		}
		public void setElement(Object o)
		{
			this.o = o;
		}
		public void addChild(No o)
		{
			filhos.add(o);
		}
		public void removeChild(No o)
		{
			filhos.remove(o);
		}
		public int childrenNumber()
		{
			return filhos.size();
		}
		public Iterator children()
		{
			return filhos.iterator();
		}
	}
	/* Fim da classe aninhada para armazenar o nó */
}
