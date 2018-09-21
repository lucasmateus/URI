public class Curso{
  private String nome;
  private String descricao;
  private double valor;

  public Curso(String nome, String descricao, double valor){
    this.nome = nome;
    this.descricao = descricao;
    this.valor = valor;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  public void setDescricao(String descricao){
    this.descricao = descricao;
  }
  public void setValor(double valor){
    this.valor = valor;
  }
  public String getNome(){
    return this.nome;
  }
  public String getDescricao(){
    return this.descricao;
  }
  public double getValor(){
    return this.valor;
  }
}