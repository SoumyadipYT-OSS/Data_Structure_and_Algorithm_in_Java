package Algo;
/*  Write a java program to create a singly linked list.*/
public class q14
{
    private ListNode_q14 head;
    private static class ListNode_q14 {
        private int data;
        private ListNode_q14 next;
        public ListNode_q14(int data) {     // constructor
            this.data=data;
            this.next=null;
        }
    }

    // method to display singly linked list
    static void display_linkedList(ListNode_q14 H_val) {
        ListNode_q14 current = H_val;
        while (current!=null) {
            System.out.print(current.data+"-->");
            current=current.next;
        }System.out.println("NULL");
    }

    // main method
    @SuppressWarnings({"static-access"})
    public static void main(String[] args)
    {
        q14 q = new q14();
        q.head = new ListNode_q14(12);
        ListNode_q14 second_node = new ListNode_q14(46);
        ListNode_q14 third_node = new ListNode_q14(16);
        ListNode_q14 fourth_node = new ListNode_q14(20);
        ListNode_q14 fifth_node = new ListNode_q14(34);
        // Linking the nodes using next
        q.head.next=second_node;
        second_node.next=third_node;
        third_node.next=fourth_node;
        fourth_node.next=fifth_node;
        fifth_node.next=null;
        q.display_linkedList(q.head);
    }
}