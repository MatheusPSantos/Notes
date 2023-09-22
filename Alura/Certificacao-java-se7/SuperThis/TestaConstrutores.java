class Mae {
  long numeroGrande;
  long segundoNumeroGrande;

  Mae() {

  }

  Mae(String s) {
    System.out.println("mae");
  }

  Mae(int i) {

  }
}

class Filha extends Mae {

  long segundoNumeroGrande;

  Filha(int i) {
    this("numero: " + i);
    super.numeroGrande = 33;
    super.segundoNumeroGrande = 33;
    this.segundoNumeroGrande = 34;
  }

  Filha(String s) {
    System.out.println("filha: " + s);
  }

  Filha() {
    super();
  }
}