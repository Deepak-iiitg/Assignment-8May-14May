public class Pairwise {

    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
 
    void pairWiseSwap()
    {
        Node temp = head;
 
       
        while (temp != null && temp.next != null) {
 
            
            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;
            temp = temp.next.next;
        }
    }
 

    public void push(int new_data)
    {
       
        Node new_node = new Node(new_data);
 
        
        new_node.next = head;
 
        
        head = new_node;
    }
 
    /* Function to print linked list */
    void printList()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
 
    /* Driver program to test above functions */
    public static void main(String args[])
    {
        Pairwise llist = new Pairwise();
 
        /* Created Linked List 1->2->3->4->5 */
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);
 
        System.out.println("Linked List before calling pairWiseSwap() ");
        llist.printList();
 
        llist.pairWiseSwap();
 
        System.out.println("Linked List after calling pairWiseSwap() ");
        llist.printList();
    }
    
}
