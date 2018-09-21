import java.util.ArrayList;

public class Usuario{
  private String nome;
  private String email;
  private String senha;
  private ArrayList<Curso> cursos;

  public Usuario(String nome, String email, String senha){
    this.nome = nome;
    this.email = email;
    this.senha = senha;
    this.cursos = new ArrayList();
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  public void setEmail(String email){
    this.email = email;
  }
  public void setSenha(String senha){
    this.senha = senha;
  }
  public String getNome(){
    return this.nome;
  }
  public String getEmail(){
    return this.email;
  }
  public String getSenha(){
    return this.senha;
  }
  public void addCurso(Curso curso){
    this.cursos.add(curso);
  }
  public ArrayList<Curso> getCursos(){
    return this.cursos;
  }
}