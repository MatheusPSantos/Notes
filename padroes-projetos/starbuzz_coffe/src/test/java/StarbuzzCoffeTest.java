import com.br.padroesdoprojetos.starbuzzcoffe.Beverage;
import com.br.padroesdoprojetos.starbuzzcoffe.DarkRoast;
import com.br.padroesdoprojetos.starbuzzcoffe.Expresso;
import com.br.padroesdoprojetos.starbuzzcoffe.Milk;
import com.br.padroesdoprojetos.starbuzzcoffe.Mocha;

public class StarbuzzCoffeTest {

    public static void main(String[] args) {
        Beverage beverage = new Expresso();

        System.out.println(beverage.getDescription());

        /// Decorator Pattern
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Milk(beverage2);

        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

    }

}
