import java.util.ArrayList;

public class Cliente {

    public static int idCliente;
    public String nome;
    public long cpf;
    public long telefone;
    public String endereco;
    public ArrayList<Comanda> comandas;

    public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    
    

    public Cliente(int idCliente, String nome, long cpf, long telefone, String endereco) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.cpf = telefone;
        this.endereco = endereco;
        this.comandas = new ArrayList<Comanda>();

        clientes.add(this);
    
    }
    public static Cliente verificaId(int idCliiente) throws Exception {
        for (Cliente cliente : clientes) {
            if (cliente.idCliente == idCliente) {
                return cliente;
            }
        }

        throw new Exception("Cliente não encontrado");
    }
     
}