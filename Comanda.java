import java.util.ArrayList;
import java.util.List;

public class Comanda {

    public int idComanda;
    public int numero;
    public String data;
    List<Integer> idsPizza;
    public Cliente cliente;
    public Sabor sabor;

    public static ArrayList<Comanda> comandas = new ArrayList<Comanda>();

    public Comanda(int idComanda, int numero, String data, List<Integer> idsPizza, Cliente cliente) {
        this.idComanda = idComanda;
        this.numero = numero;
        this.data = data;
        this.idsPizza = idsPizza;
        this.comandas = new ArrayList<Comanda>();

        this.cliente = cliente;

        cliente.comandas.add(this);

        comandas.add(this);
    }

    public String getSabores() throws Exception {
        String sabores ="";
        for (Pizza pizza : Pizza.pizzas) {
            sabores += "*" + Sabor.getSabor(pizza.saborId).descricao;
        }
        return sabores;
    }
}
