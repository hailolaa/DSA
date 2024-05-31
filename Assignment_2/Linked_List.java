package Assignment_2;

public class Linked_List {
    Node head;

    public Linked_List() {
        this.head = null;
    }

    //Inserting a Node at Any Given Position in a Singly Linked List:
    public void insertAtPos(int newData, int position) {
        Node newNode = new Node(newData);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        for(int i=1; i<position-1 && current!=null;i++){
            current = current.next;
        }
       if(current == null){
           throw new IndexOutOfBoundsException("out of bounds");
       }
       newNode.next = current.next;
       current.next=newNode;
    }

    //Deleting a Node at Any Given Position in a Singly Linked List
    public void deleteAtPosition(int position){
        if(position == 1){
            head = head.next;
        }
        Node current = head;
        for(int i=1; i<position-1 && current != null;i++){
            current = current.next;
        }

        if(current == null && current.next == null){
            throw new IndexOutOfBoundsException("out of bounds");
        }

        current.next=current.next.next;

    }


    // Deleting a Node  after a given node.
    public void deleteAfterNode(Node prevNode) {
        if(prevNode != null && prevNode.next != null) {
            prevNode.next = prevNode.next.next;
        }
    }

    // Searching a Node in a Singly Linked List.
    public boolean searchNode(int Specific_value) {
        Node current = head;
        while (current != null) {
            if (current.value == Specific_value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    //  To Display the linked list
    public void viewLinkedList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}


