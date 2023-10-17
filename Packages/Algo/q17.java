package Algo;
/*  Insert node at the end of the linked list */
public class q17
{
    private static ListNode_q17 head;
    private static class ListNode_q17 {
        private int data;
        private ListNode_q17 next;
        public ListNode_q17(int data) {     // constructor
            this.data=data;
            this.next=null;
        }
    }

    // method to add node at the end of the singly linked list
    static void insert_at_end(int value) {
        ListNode_q17 newNode = new ListNode_q17(value);
        if (head==null) {
            head=newNode;
            return;
        }
        ListNode_q17 current = head;
        while (null!=current.next) {
            current=current.next;
        }
        current.next=newNode;
    }

    // method to print the singly linked list
    static void display_linkedList(ListNode_q17 head) {
        ListNode_q17 current = head;
        while (current!=null) {
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("NULL");
    }

    // main method
    public static void main(String[] args)
    {
        q17 q = new q17();
        q.insert_at_end(20);
        q.insert_at_end(15);
        q.insert_at_end(40);
        q.insert_at_end(54);
        q.insert_at_end(35);
        q.insert_at_end(23);
        q.insert_at_end(21);
        q.display_linkedList(q.head);
    }
}