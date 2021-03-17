package javaapplication79;


public class DLL {
    Node head; 
    class Node {
        int data;
        Node prev;
        Node next;
 
       
        Node(int d) { data = d; }
    }
    public void add(int new_data)
    {
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        new_Node.prev = null;
        if (head != null)
            head.prev = new_Node;
        head = new_Node;
    }
    public void printlist(Node node)
    {
        Node last = null;
 
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
 
        System.out.println();
    }
    void deleteNode(Node del)
    {
        if (head == null || del == null) {
            return;
        }
        if (head == del) {
            head = del.next;
        }
        if (del.next != null) {
            del.next.prev = del.prev;
        }
        if (del.prev != null) {
            del.prev.next = del.next;
        }
        return;
    }
    public static void main(String[] args)
    {
        DLL dll = new DLL();
        dll.add(2);
        dll.add(4);
        dll.add(8);
        dll.add(10);
        System.out.print("Created DLL is: ");
        dll.printlist(dll.head);
        dll.deleteNode(dll.head);
        System.out.print("\nList after deleting first node: ");
        dll.printlist(dll.head);
        dll.deleteNode(dll.head.next);
        System.out.print("\nList after Deleting middle node: ");
        dll.printlist(dll.head);
    }
}
