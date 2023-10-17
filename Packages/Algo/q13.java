package Algo;
/*  How to print elements of a singly linked list in java */
public class q13
{
    private static ListNode_q13 head;
    private static class ListNode_q13 {
        private int data;
        private ListNode_q13 next;
        public ListNode_q13(int data) {
            this.data=data;
            this.next=null;
        }
    }

    // main method
    public static void main(String[] args)
    {
        q13 q = new q13();
        q.head = new ListNode_q13(10);
        ListNode_q13 second = new ListNode_q13(1);
        ListNode_q13 third = new ListNode_q13(8);
        ListNode_q13 fourth = new ListNode_q13(11);
        q.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=null;
        ListNode_q13 current = head;
        while (current!=null) {
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
    }
}