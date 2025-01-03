// Time Complexity : O(n)
// Space Complexity : O(n)
// Code runs correctly for the test cases provided.

// Java program to implement a Singly Linked List 
public class Exercise_3 {

    Node head; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;
        Node next;

        Node(int d) {
            this.data = d;
        }
    }

    // Method to insert a new node
    public static Exercise_3 insert(Exercise_3 list, int data) {

        // Create a new node with given data
        Node node = new Node(data);
        // If the Linked List is empty, then make the new node as head
        if (list.head == null) {
            list.head = node;
        }
        // Else traverse till the last node and insert the new_node there
        else {
            Node present = list.head;
            while (present.next != null) {
                present = present.next;
            }
            // Insert the new_node at last node
            present.next = node;
        }
        // Return the list by head
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(Exercise_3 list) {

        // Traverse through the LinkedList
        Node listNode = list.head;
        while (listNode != null) {

            // Print the data at current node
            System.out.print(listNode.data);
            if (listNode.next != null)
                System.out.print(" -> ");

            // Go to next node
            listNode = listNode.next;
        }

    }

    // Driver code
    public static void main(String[] args) {
        /* Start with the empty list. */
        Exercise_3 list = new Exercise_3();

        //
        // ******INSERTION******
        //

        // Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);

        // Print the LinkedList
        printList(list);
    }
}