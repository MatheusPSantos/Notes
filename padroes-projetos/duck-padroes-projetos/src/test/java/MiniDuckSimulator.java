import com.br.padroesdeprojetos.duck.Duck;
import com.br.padroesdeprojetos.duck.FlyRocketPowered;
import com.br.padroesdeprojetos.duck.MallardDuck;
import com.br.padroesdeprojetos.duck.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }    
}
