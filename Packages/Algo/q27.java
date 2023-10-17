package Algo;
/* How to remove duplicate from sorted Singly Linked List in Java? */
public class q27 extends Thread
{
    private ListNode_q27 head;
    private static class ListNode_q27 {
        private int data;
        private ListNode_q27 next;
        public ListNode_q27 (int data) {
            this.data = data;
            this.next = null;
        }
    }

    // method to display singly linked list
    protected void display_LinkedList(ListNode_q27 H_val) {
        ListNode_q27 current = H_val;
        while (current!=null) {
            System.out.print(current.data+"-->");
            current=current.next;
        } System.out.println("NULL");
    }

    // method to remove the duplicate value node from the sorted singly linked list
    protected void remove_DuplicateElement(ListNode_q27 head) {
        ListNode_q27 current = head;
        while (current!=null && current.next!=null) {
            if (current.data==current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    // main method
    public static void main(String[] args) throws InterruptedException
    {
        q27 q = new q27();
        q.head = new ListNode_q27(15);
        ListNode_q27 second = new ListNode_q27(13);
        ListNode_q27 third = new ListNode_q27(10);
        ListNode_q27 fourth = new ListNode_q27(10);
        ListNode_q27 fifth = new ListNode_q27(12);
        ListNode_q27 sixth = new ListNode_q27(19);
        q.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = null;
        System.out.println("__Original Linked List__");
        q.display_LinkedList(q.head);
        System.out.println("Removing duplicate value from the linked list...");
        Thread.sleep(400);
        q.remove_DuplicateElement(q.head);
        System.out.println("Updated linked list:");
        q.display_LinkedList(q.head);
    }
}