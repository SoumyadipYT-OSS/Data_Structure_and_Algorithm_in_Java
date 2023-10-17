package Algo;
/*  Insert node at the beginning of a singly linked list */
public class q16
{
    private static ListNode_q16 head;
    private static class ListNode_q16 {
        private int data;
        private ListNode_q16 next;
        public ListNode_q16(int data) {     // constructor
            this.data=data;
            this.next=null;
        }
    }

    // method to print the linked list element
    static void display_LinkedList(ListNode_q16 head) {
        ListNode_q16 current = head;
        while (current!=null) {
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("NULL");
    }

    // method to inset node at the beginning in singly linked list
    static void inset_at_beginning(int value) {
        ListNode_q16 newNode = new ListNode_q16(value);
        newNode.next=head;
        head=newNode;
    }

    // main method
    public static void main(String[] args)
    {
        q16 q = new q16();
        q.inset_at_beginning(11);
        q.inset_at_beginning(8);
        q.inset_at_beginning(1);
        q.inset_at_beginning(10);
        q.display_LinkedList(q.head);
    }
}