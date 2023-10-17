package Algo;
/* How to detect a loop in a Singly Linked List in Java? */
public class q31 extends Thread
{
    private ListNode_q31 head;
    private static class ListNode_q31 {
        private int data;
        private ListNode_q31 next;
        public ListNode_q31 (int data) {
            this.data =data;
            this.next = null;
        }
    }
    // method to detect loop in a singly linked list
    protected boolean detectLoop (ListNode_q31 head) {
        ListNode_q31 fastPointer = head;
        ListNode_q31 slowPointer = head;
        while (fastPointer!=null && fastPointer.next!=null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if (fastPointer==slowPointer) {
                System.out.println("Linked List contains a loop.");
                return true;
            }
        } if (fastPointer!=slowPointer) {
            System.out.println("Linked List doesn't contain a loop.");
        }
        return false;
    }
    // main method
    public static void main(String[] args) throws InterruptedException
    {
        q31 q = new q31();
        q.head = new ListNode_q31(1);
        ListNode_q31 second = new ListNode_q31(2);
        ListNode_q31 third = new ListNode_q31(3);
        ListNode_q31 fourth = new ListNode_q31(4);
        ListNode_q31 fifth = new ListNode_q31(5);
        ListNode_q31 sixth = new ListNode_q31(6);
        q.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        sixth.next=third;
        System.out.println("Checking the linked list contains a loop or not...");
        Thread.sleep(900);
        q.detectLoop(q.head);
    }
}