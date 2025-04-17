// WAP TO PRFORM SINGLY CIRCULAR LINK LIST.

public class SinglyCircularLinkedList {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    Node head = null;
    Node tail = null;

    // Insert node at the end
    public void insert(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // circular link
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }

        System.out.println("Inserted: " + value);
    }

    // Delete a node by value
    public void delete(int value) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        Node previous = null;

        do {
            if (current.data == value) {
                if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else if (current == tail) {
                    tail = previous;
                    tail.next = head;
                } else {
                    previous.next = current.next;
                }
                System.out.println("Deleted: " + value);
                return;
            }
            previous = current;
            current = current.next;
        } while (current != head);

        System.out.println("Value not found.");
    }

    // Display the circular linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        System.out.print("Circular List: ");
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }

    // Main method
    public static void main(String[] args) {
        SinglyCircularLinkedList list = new SinglyCircularLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();

        list.delete(20);
        list.display();

        list.delete(40); // Not in list
        list.display();
    }
}
