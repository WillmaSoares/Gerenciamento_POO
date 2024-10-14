import java.util.Scanner;

public class Gerenciamento {


        private static TaskManager taskManager = new TaskManager();
        private static Scanner scanner = new Scanner(System.in);

        static int getIntInput () {
            while (true) {
                try {
                    return Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.print("Entrada inválida. Por favor, insira um número: ");
                }
            }
        }


        public static void addTask () {
            System.out.print("Digite a descrição da tarefa: ");
            String description = scanner.nextLine();
            taskManager.addTask(description);
            System.out.println("Tarefa adicionada com sucesso.");
        }

        public static void removeTask () {
            taskManager.listTasks();
            System.out.print("Digite o número da tarefa para remover: ");
            int index = getIntInput();
            try {
                taskManager.removeTask(index);
                System.out.println("Tarefa removida com sucesso.");
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }


        protected static void markTaskAsCompleted () {
                taskManager.listTasks();
                System.out.print("Digite o número da tarefa para marcar como concluída: ");
                int index = getIntInput();
                try {
                    taskManager.markTaskAsCompleted(index);
                    System.out.println("Tarefa marcada como concluída.");
                } catch (IndexOutOfBoundsException e) {
                    System.out.println(e.getMessage());
                }
        }

        protected static void listTasks () {
            System.out.println("Lista de tarefas:");
            taskManager.listTasks();
        }

}


