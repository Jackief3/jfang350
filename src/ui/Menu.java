package ui;

import java.util.Scanner;

import factory.PersonalTaskFactory;
import factory.SchoolTaskFactory;
import factory.TaskFactory;
import factory.WorkTaskFactory;
import service.TaskManager;
import task.Task;
import validator.TaskValidator;

public class Menu {

    private Scanner scanner = new Scanner(System.in);
    private TaskManager taskManager = new TaskManager();

    public void start() {

        while (true) {

            System.out.println("\n===== Task Management System =====");
            System.out.println("1. Add Work Task");
            System.out.println("2. Add School Task");
            System.out.println("3. Add Personal Task");
            System.out.println("4. View Tasks");
            System.out.println("5. Exit");
            System.out.print("Choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addTask(new WorkTaskFactory());
                    break;

                case 2:
                    addTask(new SchoolTaskFactory());
                    break;

                case 3:
                    addTask(new PersonalTaskFactory());
                    break;

                case 4:
                    viewTasks();
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private void addTask(TaskFactory factory) {

        System.out.print("Title: ");
        String title = scanner.nextLine();

        System.out.print("Description: ");
        String description = scanner.nextLine();

        Task task = factory.createTask(title, description);

        TaskValidator validator = factory.createValidator();

        if (validator.validate(task)) {

            taskManager.addTask(task);
            System.out.println("Task added successfully!");

        } else {

            System.out.println("Invalid task.");

        }
    }

    private void viewTasks() {

        if (taskManager.getTasks().isEmpty()) {

            System.out.println("No tasks found.");
            return;

        }

        for (Task task : taskManager.getTasks()) {

            System.out.println("----------------------");
            System.out.println(task);

        }
    }

}