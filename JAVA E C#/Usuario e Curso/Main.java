class Main {
  public static void main(String[] args) {
    Usuario user = new Usuario("lucas mateus","lukinhasm07@outlook.com","1234567");
    Curso curso1 = new Curso("Algoritmo","Professor Gorgiano",19.90);
    Curso curso2 = new Curso("Programação estruturada","Professor Tio Beto",19.90);
    Curso curso3 = new Curso("Estrutura de dados","Professor Coleguinha",19.90);
    user.addCurso(curso1);
    user.addCurso(curso2);
    user.addCurso(curso3);
    System.out.println("\nCursos ofertados");
    System.out.println();
    for(int i=0;i<user.getCursos().size();i++){
      System.out.println("Nome: "+user.getCursos().get(i).getNome());
      System.out.println("Descrição: "+user.getCursos().get(i).getDescricao());
      System.out.println("Valor: "+user.getCursos().get(i).getValor());
      System.out.println();
    }
  }
}