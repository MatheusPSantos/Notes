import com.br.padroesdeprojetos.factory.NYPizzaStore;
import com.br.padroesdeprojetos.factory.PizzaStore;

public class TestPizzaNY {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");
        
    }
}
