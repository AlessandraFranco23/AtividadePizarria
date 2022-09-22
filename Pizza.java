import java.util.ArrayList;
import java.util.List;

public class Pizza {
    public int pizzaId;
    public int saborId;
    public String tamanho;

    public static List<Pizza> pizzas = new ArrayList<Pizza>();

    public Pizza(int idPizza, int saborId, String tamanho) {
        this.pizzaId = idPizza;
        this.saborId = saborId;
        this.tamanho = tamanho;

        this.pizzas.add(this);
    }
}
