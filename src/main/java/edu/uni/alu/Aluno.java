package edu.uni.alu;

public class Aluno {
  private String nome;
  private String id;

  public Aluno(String nome, String id){
    this.nome = nome;
    this.id = id;
  }

  public String getNome(Aluno aluno) {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

}
