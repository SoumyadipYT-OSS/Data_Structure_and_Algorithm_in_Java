package Algo;
/* Insert a node in a singly linked list at given position */
public class q18
{
    private static ListNode_q18 head;
    private class ListNode_q18 {
        private int data;
        private ListNode_q18 next;
        public ListNode_q18(int data) {     // constructor
            this.data=data;
            this.next=null;
        }
    }

    // method to print the linked list
    static void printLinkedList () {
        ListNode_q18 current = head;
        while (current!=null) {
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("NULL");
    }

    // method to insert a node at a given position
    public void insert_node_given_position(int position, int value) {
        ListNode_q18 node = new ListNode_q18(value);
        if (position==1) {
            node.next=head;
            head=node;
        } else {
            ListNode_q18 previous = head;
            int count=1;
            while (count < position-1) {
                previous=previous.next;
                count++;
            }
            ListNode_q18 current = previous.next;
            previous.next=node;
            node.next=current;
        }
    }

    // main method
    public static void main(String[] args)
    {
        q18 q = new q18();
        q.insert_node_given_position(1,3);
        q.insert_node_given_position(2,5);
        q.insert_node_given_position(3,2);
        q.insert_node_given_position(4,4);
        q.printLinkedList();
    }
}