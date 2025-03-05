package todolist;
import java.util.ArrayList;
import java.util.Scanner;


public class Todolist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Task class to represent a single task
		class Task {
		    private String description;
		    private boolean isCompleted;

		    // Constructor
		    public Task(String description) {
		        this.description = description;
		        this.isCompleted = false; // By default, tasks are not completed
		    }

		    // Getters and Setters
		    public String getDescription() {
		        return description;
		    }

		    public boolean isCompleted() {
		        return isCompleted;
		    }

		    public void setCompleted(boolean completed) {
		        isCompleted = completed;
		    }

		    @Override
		    public String toString() {
		        String status = isCompleted ? "[X]" : "[ ]";
		        return status + " " + description;
		    }
		}

		// ToDoList class to manage the list of tasks
		class ToDoList {
		    private ArrayList<Task> tasks;

		    // Constructor
		    public ToDoList() {
		        tasks = new ArrayList<>();
		    }

		    // Add a task
		    public void addTask(String description) {
		        Task newTask = new Task(description);
		        tasks.add(newTask);
		        System.out.println("Task added: " + description);
		    }

		    // View all tasks
		    public void viewTasks() {
		        if (tasks.isEmpty()) {
		            System.out.println("No tasks in the list.");
		        } else {
		            System.out.println("Your To-Do List:");
		            for (int i = 0; i < tasks.size(); i++) {
		                System.out.println((i + 1) + ". " + tasks.get(i));
		            }
		        }
		    }

		    // Mark a task as completed
		    public void markTaskAsCompleted(int index) {
		        if (index >= 0 && index < tasks.size()) {
		            Task task = tasks.get(index);
		            task.setCompleted(true);
		            System.out.println("Task marked as completed: " + task.getDescription());
		        } else {
		            System.out.println("Invalid task number.");
		        }
		    }

		    // Delete a task
		    public void deleteTask(int index) {
		        if (index >= 0 && index < tasks.size()) {
		            Task removedTask = tasks.remove(index);
		            System.out.println("Task deleted: " + removedTask.getDescription());
		        } else {
		            System.out.println("Invalid task number.");
		        }
		    }
		}

		// Main application class
	
		        ToDoList toDoList = new ToDoList();
		        Scanner scanner = new Scanner(System.in);
		        boolean running = true;

		        while (running) {
		            System.out.println("\n--- To-Do List App ---");
		            System.out.println("1. Add Task");
		            System.out.println("2. View Tasks");
		            System.out.println("3. Mark Task as Completed");
		            System.out.println("4. Delete Task");
		            System.out.println("5. Exit");
		            System.out.print("Choose an option: ");

		            int choice = scanner.nextInt();
		            scanner.nextLine(); // Consume the newline character

		            switch (choice) {
		                case 1:
		                    System.out.print("Enter task description: ");
		                    String description = scanner.nextLine();
		                    toDoList.addTask(description);
		                    break;
		                case 2:
		                    toDoList.viewTasks();
		                    break;
		                case 3:
		                    System.out.print("Enter task number to mark as completed: ");
		                    int taskIndex = scanner.nextInt() - 1; // Convert to 0-based index
		                    toDoList.markTaskAsCompleted(taskIndex);
		                    break;
		                case 4:
		                    System.out.print("Enter task number to delete: ");
		                    int deleteIndex = scanner.nextInt() - 1; // Convert to 0-based index
		                    toDoList.deleteTask(deleteIndex);
		                    break;
		                case 5:
		                    running = false;
		                    System.out.println("Exiting the app. Goodbye!");
		                    break;
		                default:
		                    System.out.println("Invalid option. Please try again.");
		            }
		        }

		        scanner.close();
		        
		    }
		

	}


