package Assignment_2;
//Implementing a Stack Using Linked Lists
public class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    // Push method
    public void push(int newValue) {
        Node newNode = new Node(newValue);
        newNode.next = top;
        top = newNode;
    }

    // Pop method
    public int pop() {
        int removedValue = top.value;
        top = top.next;
        return removedValue;
    }

    // Peek method
    public int peek() {
        return top.value;
    }

    // Display the stack
    public void display() {
        Node current = top;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
    }
}

