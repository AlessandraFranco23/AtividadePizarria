import java.util.ArrayList;

public class Sabor {

    public int idSabor;
    public String descricao;
    public String detalhamento;

    public static ArrayList<Sabor> sabores = new ArrayList<Sabor>();

    public Sabor(int idSabor, String descricao, String detalhamento) {
        this.idSabor = idSabor;
        this.descricao = descricao;
        this.detalhamento = detalhamento;

        sabores.add(this);
    }

    public static Sabor getSabor(int idSabor) throws Exception {
        for (Sabor sabor : Sabor.sabores) {
            if (sabor.idSabor == idSabor) {
                return sabor;
            }
        }
        throw new Exception("Sabor nao encontrado");
    }
}