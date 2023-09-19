package Encapsulamento.Encapsulamento;

public class Pessoa {
  private String nome;

  String getNome() {
    return nome;
  }

  void setNome(String nome) {
    if (nome == null)
      nome = "";
    this.nome = nome;
  }
}
