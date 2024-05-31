package Assignment_1;

import java.util.LinkedList;

public class ToDoList {
    Node head;

    public ToDoList() {
        this.head = null;
    }

    public void addToDo(Task task) {
        Node newTask = new Node(task);

        if (head == null) {
            head = newTask;
        } else {
            newTask.next = null;

            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newTask;
        }
    }

    public void markToDoAsCompleted(String title){
            Node current = head;
            while (current != null) {
                if (current.task.getTitle().equals(title)) {
                    current.task.markCompleted();
                    return;
                }
                    current = current.next;

            }
        }

    public  void viewToDoList(){
        Node current = head;
        while(current!=null){
            Task task = current.task;
            String completion;
            if(task.isCompleted() == true){
                 completion = "completed";
            }
            else{
                completion ="incomplete";
            }
            System.out.println("Task: " + task.getTitle() + " Description: " + task.getDescription() + " Remark: " + completion);
            current = current.next;

        }
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();

        Task task_1 = new Task("Do assignment","Assignment 1 & Assignment 2");
        Task task_2 = new Task("Study ","Study all courses for final");
        Task task_3 = new Task("Workout","complete a 30 minute workout session");

        toDoList.addToDo(task_1);
        toDoList.addToDo(task_2);
        toDoList.addToDo(task_3);

        System.out.println("To Do List");
        toDoList.viewToDoList();

        toDoList.markToDoAsCompleted("Do assignment");

        System.out.println("updated To Do List");
        toDoList.viewToDoList();
    }




}


