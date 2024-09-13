import java.util.Scanner;

public class View {
    private AçoesDAO contasDAO;

    public View(AçoesDAO contaDAO) {
        this.contasDAO = contaDAO;
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Criar Conta Corrente");
            System.out.println("2. Criar Conta Poupança");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Depositar");
            System.out.println("5. Sacar");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (opcao) {
                case 1:
                    criarConta(scanner, "Corrente");
                    break;
                case 2:
                    criarConta(scanner, "Poupança");
                    break;
                case 3:
                    consultarSaldo(scanner);
                    break;
                case 4:
                    realizarOperacao(scanner, "Depositar");
                    break;
                case 5:
                    realizarOperacao(scanner, "Sacar");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void criarConta(Scanner scanner, String tipo) {
        System.out.print("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        ContasDTO contasDTO = new ContasDTO(tipo, saldo);
        contaDAO.save(contasDTO);
        System.out.println(tipo + " criada com saldo de R$" + saldo);
    }

    private void consultarSaldo(Scanner scanner) {
        System.out.print("Digite o tipo da conta (Corrente/Poupança): ");
        String tipo = scanner.nextLine();
        ContasDTO contaDTO = (ContasDTO) contaDAO.find(tipo);
        if (contaDTO != null) {
            System.out.println("Saldo da Conta " + tipo + ": R$" + contaDTO.getSaldo());
        } else {
            System.out.println("Conta não encontrada!");
        }
    }

    private void realizarOperacao(Scanner scanner, String operacao) {
        System.out.print("Digite o tipo da conta (Corrente/Poupança): ");
        String tipo = scanner.nextLine();
        System.out.print("Digite o valor: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();

        ContasDTO contaDTO = (ContasDTO) contaDAO.find(tipo);
        if (contaDTO != null) {
            if (operacao.equals("Depositar")) {
                contaDTO.setSaldo(contaDTO.getSaldo() + valor);
            } else if (operacao.equals("Sacar")) {
                if (valor <= contaDTO.getSaldo()) {
                    contaDTO.setSaldo(contaDTO.getSaldo() - valor);
                } else {
                    System.out.println("Saldo insuficiente para saque de R$" + valor);
                    return;
                }
            }
            contaDAO.save(contasDTO);
            System.out.println(operacao + " de R$" + valor + " realizada com sucesso.");
        } else {
            System.out.println("Conta não encontrada!");
        }
    }

    public static void main(String[] args) {
        AçoesDAO contaDAO = new AçoesDAOImpl();
        View contaView = new View(contaDAO);
        contaView.mostrarMenu();
    }
}

