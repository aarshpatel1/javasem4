//  WAP TO PERFORM SINGLY LINK LIST.

class SinglyLinkedList {
    // Node structure
    class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    // Head of the list
    Node head = null;

    // Insert at the end
    public void insert(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            System.out.println("Inserted: " + value);
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;

            temp.next = newNode;
            System.out.println("Inserted: " + value);
        }
    }

    // Delete a node by value
    public void delete(int value) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.data == value) {
            head = head.next;
            System.out.println("Deleted: " + value);
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != value)
            temp = temp.next;

        if (temp.next == null) {
            System.out.println("Value not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Deleted: " + value);
        }
    }

    // Display the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();

        list.delete(20);
        list.display();

        list.delete(50); // Not in list
        list.display();
    }
}
