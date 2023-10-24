package com.taskmanager;

import java.util.ArrayList;
import java.util.Scanner;

class Task {
    private String title;
    private boolean isComplete;

    public Task(String title) {
        this.title = title;
        this.isComplete = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void markComplete() {
        isComplete = true;
    }

    @Override
    public String toString() {
        return (isComplete ? "[X] " : "[ ] ") + title;
    }
}

class TaskList {
    private ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(String title) {
        Task task = new Task(title);
        tasks.add(task);
    }

    public void markTaskAsComplete(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markComplete();
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public void listTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }
}

public class TaskListManager {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Task List Manager\n-----------------\n1. Add a task\n2. List tasks\n3. Mark task as complete\n4. Exit");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (option) {
                case 1:
                    System.out.print("Enter the task title: ");
                    String title = scanner.nextLine();
                    taskList.addTask(title);
                    break;

                case 2:
                    System.out.println("Tasks:");
                    taskList.listTasks();
                    break;

                case 3:
                    System.out.print("Enter the index of the task to mark as complete: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline character
                    taskList.markTaskAsComplete(index - 1);  // Adjust for 0-based index
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
