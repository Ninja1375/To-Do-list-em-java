import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Completar tarefa");
            System.out.println("4. Remover tarefa");
            System.out.println("5. Sair");

            int option = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer

            switch (option) {
                case 1:
                    System.out.println("Introduza a descrição da tarefa:");
                    String description = scanner.nextLine();
                    taskManager.addTask(description);
                    break;
                case 2:
                    taskManager.showTasks();
                    break;
                case 3:
                    System.out.println("Introduza o índice da tarefa a completar:");
                    int completeIndex = scanner.nextInt();
                    taskManager.completeTask(completeIndex);
                    break;
                case 4:
                    System.out.println("Introduza o índice da tarefa a remover:");
                    int removeIndex = scanner.nextInt();
                    taskManager.removeTask(removeIndex);
                    break;
                case 5:
                    exit = true;
                    System.out.println("A sair...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
