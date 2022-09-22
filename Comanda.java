import java.util.ArrayList;

public class Comanda {

        public int idComanda;
        public int numero;
        public String data;
        public int idCliente;
        public int idPizza;
        public int idSabor;
    
        public Cliente cliente;
        public Sabor sabor; 
    
        public static ArrayList<Comanda> comandas = new ArrayList<Comanda>();
    
    
        public Comanda(int idComanda, int numero, String data, int idPizza, Cliente cliente) {
            this.idComanda = idComanda;
            this.numero = numero;
            this.data = data; 
            this.idPizza = idPizza;
            this.comandas = new ArrayList<Comanda>();
    
            this.cliente = cliente; 

            cliente.comandas.add(this);

            comandas.add(this);
        }
         
        public void cadastrarPizza(int idComanda, int idPizza, idSabor){
    
        // }
    
        // public void listarCliente(){
    
        // }
    }
}


