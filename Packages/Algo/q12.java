package Algo;
/*  Create a singly linked list */
public class q12
{
    private ListNode_q12 head;  // head is an instance variable
    private static class ListNode_q12 {
        private int data;
        private ListNode_q12 next;
        public ListNode_q12(int data) { // constructor
            this.data=data;
            this.next=null;
        }
    }

    // main method
    public static void main(String[] args)
    {
        q12 q = new q12();
        q.head = new ListNode_q12(10);
        ListNode_q12 second = new ListNode_q12(1);
        ListNode_q12 third = new ListNode_q12(8);
        ListNode_q12 fourth = new ListNode_q12(11);

        // now we will connect the List_Nodes to form a chain
        q.head.next=second; // 10-->1
        second.next=third;  // 10-->1-->8
        third.next=fourth;  // 10-->1-->8-->11
        fourth.next=null;   // 10-->1-->8-->11-->null
    }
}