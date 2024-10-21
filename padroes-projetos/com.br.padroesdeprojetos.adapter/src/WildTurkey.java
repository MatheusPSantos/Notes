public class WildTurkey implements Turkey {

    public WildTurkey() {}

    @Override
    public void fly() {
        System.out.println("I am flying a short distance");
    }

    @Override
    public void gobble() {
        System.out.println("gobble gobble");
    }

}
