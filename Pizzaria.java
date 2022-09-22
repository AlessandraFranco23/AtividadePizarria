import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pizzaria {
    public static void main(String[] args) throws Exception {

        int menu = 1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Digite a opção");
            System.out.println("1 - Finalizar atendimento");
            System.out.println("2 - Cadastrar Cliente");
            System.out.println("3 - Listar o cliente");
            System.out.println("4 - Cadastrar sabor");
            System.out.println("5 - Listar sabor");
            System.out.println("6 - Cadastrar comanda");
            System.out.println("7 - Listar comanda");

            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Obrigada pela preferencia!");
                    break;
                case 2:
                    try {
                        System.out.println("Digite o ID do cliente: ");
                        int idCliente = scanner.nextInt();
                        System.out.println("Digite o nome do cliente: ");
                        String nome = scanner.next();
                        System.out.println("Digite o cpf do cliente");
                        long cpf = scanner.nextLong();
                        System.out.println("Digite o telefone do cliente");
                        long telefone = scanner.nextLong();
                        System.out.println("Digite o endereço do cliente: ");
                        String endereco = scanner.next();

                        Cliente cliente = new Cliente(idCliente, nome, cpf, telefone, endereco);
                        System.out.println(
                                "Id Cliente: " + cliente.idCliente + "\n"
                                        + "Nome: " + cliente.nome + "\n"
                                        + "Cpf: " + cliente.cpf + "\n"
                                        + "telefone: " + cliente.telefone + "\n"
                                        + "Endereço: " + cliente.endereco);
                    } catch (Exception error) {
                        System.out.println("Erro ao cadastrar modelo." + error.getMessage());
                    }

                    break;
                case 3:
                    for (Cliente cliente : Cliente.clientes) {
                        System.out.println(
                                "Id Cliente: " + cliente.idCliente + "\n"
                                        + "Nome: " + cliente.nome + "\n"
                                        + "Cpf: " + cliente.cpf + "\n"
                                        + "telefone: " + cliente.telefone + "\n"
                                        + "Endereço: " + cliente.endereco);
                        System.out.println("\n");
                    }
                    break;
                case 4:
                    try {
                        System.out.println("Digite do ID do sabor: ");
                        int idSabor = scanner.nextInt();
                        System.out.println("Digite a descrição do sabor: ");
                        String descricao = scanner.next();
                        System.out.println("Digite os ingredientes do sabor");
                        String detalhamento = scanner.next();

                        Sabor sabor = new Sabor(idSabor, descricao, detalhamento);
                        System.out.println(
                                "Id Sabor: " + sabor.idSabor + "\n"
                                        + "descricao: " + sabor.descricao + "\n"
                                        + "detalhamento: " + sabor.detalhamento + "\n"

                        );

                    } catch (Exception error) {
                        System.out.println("Erro ao cadastrar sabor." + error.getMessage());
                    }
                    break;
                case 5:
                    for (Sabor sabor : Sabor.sabores) {
                        System.out.println(
                                "Id Sabor: " + sabor.idSabor + "\n"
                                        + "descricao: " + sabor.descricao + "\n"
                                        + "detalhamento: " + sabor.detalhamento);
                        System.out.println("\n");
                    }
                    break;
                case 6:
                    try {
                        System.out.println("Digite o ID do cliente: ");
                        int idCliente = scanner.nextInt();
                        Cliente cliente = Cliente.verificaId(idCliente);

                        System.out.println("Digite o numero da comanda: ");
                        int numeroComanda = scanner.nextInt();

                        System.out.println("Digite o id da comanda: ");
                        int idComanda = scanner.nextInt();

                        System.out.println("Digite a data de hoje: ");
                        String data = scanner.next();

                        List<Integer> pizzas = new ArrayList<Integer>();
                        System.out.println("Digite quantas pizzas: ");
                        int qtdPizzas = scanner.nextInt();
                        for (int i = 0; i < qtdPizzas; i++) {

                            System.out.println("Qual o id do sabor? ");
                            int saborDesejado = scanner.nextInt();
                            int idSabor = Sabor.getSabor(saborDesejado).idSabor;

                            System.out.println("Digite o ID da pizza: ");
                            int idPizza = scanner.nextInt();

                            System.out.println("Digite qual o tamanho: ");
                            String tamanhoPizza = scanner.next();
                            Pizza pizza = new Pizza(idPizza, idSabor, tamanhoPizza);
                            pizzas.add(pizza.pizzaId);
                        }
                        new Comanda(idComanda, numeroComanda, data, pizzas, cliente);
                    } catch (Exception error) {
                        System.out.println("Erro ao cadastrar comanda." + error.getMessage());
                    }

                    break;
                case 7:
                    for (Comanda comanda : Comanda.comandas) {
                        System.out.println(
                                "Id Comanda: " + comanda.idComanda + "\n"
                                        + "Data: " + comanda.data + "\n"
                                        + "Sabores: " + comanda.getSabores() + "\n"
                                        + "Cliente: " + comanda.cliente.nome + "\n"
                                        + "Numero Comanda: " + comanda.numero + "\n"
                                        + "Quantidade Pizzas:" + comanda.idsPizza.size());
                        System.out.println("\n");
                    }
                    break;
                default:
                    System.out.println("Operação inválida");
                    break;

            }

        } while (menu != 1);

        scanner.close();
    }
}