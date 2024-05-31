package Assignment_2;

public class Main {
    public static void main(String[] args) {
        // LinkedList operations
        Linked_List ll = new Linked_List();
        ll.insertAtPos(1, 1);
        ll.insertAtPos(2, 2);
        ll.insertAtPos(3, 3);
        ll.insertAtPos(4, 1);
        ll.viewLinkedList();

        ll.deleteAtPosition(2);
        ll.viewLinkedList();

        System.out.println(ll.searchNode(5));

        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        stack.display();
    }
}
