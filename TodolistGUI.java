package todolist;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class TodolistGUI {
	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.util.ArrayList;

	// Task class (unchanged)
	class Task {
	    private String description;
	    private boolean isCompleted;

	    public Task(String description) {
	        this.description = description;
	        this.isCompleted = false;
	    }

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

	// ToDoList class (unchanged)
	class ToDoList {
	    private ArrayList<Task> tasks;

	    public ToDoList() {
	        tasks = new ArrayList<>();
	    }

	    public void addTask(String description) {
	        Task newTask = new Task(description);
	        tasks.add(newTask);
	    }

	    public ArrayList<Task> getTasks() {
	        return tasks;
	    }

	    public void markTaskAsCompleted(int index) {
	        if (index >= 0 && index < tasks.size()) {
	            Task task = tasks.get(index);
	            task.setCompleted(true);
	        }
	    }

	    public void deleteTask(int index) {
	        if (index >= 0 && index < tasks.size()) {
	            tasks.remove(index);
	        }
	    }
	}

	// GUI class (fixed and complete)
	public class TodolistGUI extends JFrame {
	    private ToDoList toDoList;
	    private DefaultListModel<String> listModel;
	    private JList<String> taskList;

	    public TodolistGUI() {
	        toDoList = new ToDoList();
	        listModel = new DefaultListModel<>();
	        taskList = new JList<>(listModel);

	        setTitle("Todolist App");
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new BorderLayout());

	        // Input panel
	        JPanel inputPanel = new JPanel();
	        JTextField taskField = new JTextField(20);
	        JButton addButton = new JButton("Add Task");
	        addButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String description = taskField.getText();
	                if (!description.isEmpty()) {
	                    toDoList.addTask(description);
	                    listModel.addElement(toDoList.getTasks().get(toDoList.getTasks().size() - 1).toString());
	                    taskField.setText("");
	                }
	            }
	        });

	        inputPanel.add(taskField);
	        inputPanel.add(addButton);

	        // Button panel
	        JPanel buttonPanel = new JPanel();
	        JButton completeButton = new JButton("Mark as Completed");
	        completeButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                int selectedIndex = taskList.getSelectedIndex();
	                if (selectedIndex != -1) {
	                    toDoList.markTaskAsCompleted(selectedIndex);
	                    listModel.set(selectedIndex, toDoList.getTasks().get(selectedIndex).toString());
	                }
	            }
	        });

	        JButton deleteButton = new JButton("Delete Task");
	        deleteButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                int selectedIndex = taskList.getSelectedIndex();
	                if (selectedIndex != -1) {
	                    toDoList.deleteTask(selectedIndex);
	                    listModel.remove(selectedIndex);
	                }
	            }
	        });

	        buttonPanel.add(completeButton);
	        buttonPanel.add(deleteButton);

	        // Add components to the frame
	        add(inputPanel, BorderLayout.NORTH);
	        add(new JScrollPane(taskList), BorderLayout.CENTER);
	        add(buttonPanel, BorderLayout.SOUTH);

	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        // Run the GUI on the Event Dispatch Thread
	        SwingUtilities.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                new TodolistGUI();
	            }
	        });
	    }
	}