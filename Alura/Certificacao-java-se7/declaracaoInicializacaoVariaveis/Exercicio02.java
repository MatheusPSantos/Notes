
class Exercicio02 {
    public static void main(String[] args) {
        int idade;
        if(args.length > 0) {
            idade = Integer.parseInt(args[0]);
        } else {
            System.err.println("Por favor passe sua idade como  primeiro parâmetro");
        }
        System.out.println("Sua idade é " + idade);
    }
}