
import java.util.Scanner;

public class View {
    private PagamentoDAO pagamentoDAO;

    public PagamentoView(PagamentoDAO pagamentoDAO) {
        this.pagamentoDAO = pagamentoDAO;
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Realizar pagamento com Cartão de Crédito");
            System.out.println("2. Realizar pagamento com Boleto");
            System.out.println("3. Consultar valor do pagamento");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha
            switch (opcao) {
                case 1:
                    realizarPagamento(scanner, "Cartão de Crédito");
                    break;
                case 2:
                    realizarPagamento(scanner, "Boleto");
                    break;
                case 3:
                    consultarPagamento(scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void realizarPagamento(Scanner scanner, String tipo) {
        System.out.print("Digite o valor do pagamento: ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Consumir a nova linha
        PagamentoDTO pagamentoDTO = new PagamentoDTO(tipo, valor);
        pagamentoDAO.save(pagamentoDTO);
        System.out.println("Pagamento registrado com sucesso.");
    }

    private void consultarPagamento(Scanner scanner) {
        System.out.print("Digite o tipo do pagamento (Cartão de Crédito/Boleto): ");
        String tipo = scanner.nextLine();
        PagamentoDTO pagamentoDTO = pagamentoDAO.find(tipo);
        if (pagamentoDTO != null) {
            Pagamento pagamento;
            if (tipo.equals("Cartão de Crédito")) {
                pagamento = new PagamentoCartaoCredito(pagamentoDTO.getValor());
            } else if (tipo.equals("Boleto")) {
                pagamento = new PagamentoBoleto(pagamentoDTO.getValor());
            } else {
                System.out.println("Tipo de pagamento inválido.");
                return;
            }
            System.out.println("Valor do pagamento com " + tipo + ": R$" + pagamento.calcularValor());
        } else {
            System.out.println("Pagamento não encontrado!");
        }
    }

    public static void main(String[] args) {
        PagamentoDAO pagamentoDAO = new PagamentoDAOImpl();
        PagamentoView pagamentoView = new PagamentoView(pagamentoDAO);
        pagamentoView.mostrarMenu();
    }
}

