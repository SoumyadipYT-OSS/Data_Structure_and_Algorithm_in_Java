package Algo;
/*  How to find start of a loop in a Singly Linked List? */
public class q32
{
    private ListNode_q32 head;
    private static class ListNode_q32 {
        private int data;
        private ListNode_q32 next;
        public ListNode_q32 (int data) {
            this.data = data;
            this.next = null;
        }
    }
    // method to find start of a loop in a sigly linked list
    protected ListNode_q32 find_startLoopNode (ListNode_q32 head, ListNode_q32 slowPointer) {
        ListNode_q32 temp = head;
        while (temp!=slowPointer) {
            temp = temp.next;
            slowPointer = slowPointer.next;
        }
        System.out.print("Starting node of the loop is: ");
        return temp;
    }
    // method to detect a loop in a linked list
    protected ListNode_q32 detect_loop_in_LinkedList (ListNode_q32 head) {
        ListNode_q32 fastPointer = head;
        ListNode_q32 slowPointer = head;
        ListNode_q32 top_val = head;
        while (fastPointer!=null && fastPointer.next!=null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if (fastPointer==slowPointer) {
                System.out.println("Linked List contains a loop.");
                return find_startLoopNode(top_val,slowPointer);
            }
        } if (fastPointer!=slowPointer) {
            System.out.println("Linked List does not containg a loop.");
        }
        return null;
    }
    // main method
    public static void main(String[] args)
    {
        q32 q = new q32();
        q.head = new ListNode_q32(1);
        ListNode_q32 second = new ListNode_q32(2);
        ListNode_q32 third = new ListNode_q32(3);
        ListNode_q32 fourth = new ListNode_q32(4);
        ListNode_q32 fifth = new ListNode_q32(5);
        ListNode_q32 sixth = new ListNode_q32(6);
        q.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;
        System.out.println("Finding the start node of the loop...");
        System.out.println(q.detect_loop_in_LinkedList(q.head).data);
    }
}