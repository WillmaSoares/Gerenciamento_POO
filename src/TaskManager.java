import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String description) {
        tasks.add(new SimpleTask(description));
    }

    public void removeTask(int index) {
        if (index < 0 || index >= tasks.size()) {
            throw new IndexOutOfBoundsException("Índice inválido.");
        }
        tasks.remove(index);
    }

    public void markTaskAsCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markAsCompleted();
        } else {
            throw new IndexOutOfBoundsException("Índice da tarefa inválido.");
        }
        tasks.get(index).markAsCompleted();
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Nenhuma tarefa encontrada.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + ": " + tasks.get(i));
            }
        }
    }
}
