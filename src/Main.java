
public class Main {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Gerenciador de Tarefas");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Marcar tarefa como concluída");
            System.out.println("4. Remover tarefa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int escolhaMenu = Gerenciamento.getIntInput();


            switch (escolhaMenu) {
                case 1:
                    Gerenciamento.addTask();
                    break;
                case 2:
                    Gerenciamento.listTasks();
                    break;
                case 3:
                    Gerenciamento.markTaskAsCompleted();
                    break;
                case 4:
                    Gerenciamento.removeTask();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");

            }
        }
    }
}

