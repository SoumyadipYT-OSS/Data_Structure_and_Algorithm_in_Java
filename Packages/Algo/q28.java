package Algo;
/*  Removing duplicate value from the linked list */
public class q28 extends Thread
{
    private ListNode_q28 head;
    private static class ListNode_q28 {
        private int data;
        private ListNode_q28 next;
        public ListNode_q28 (int data) {
            this.data = data;
            this.next = null;
        }
    }

    // method to display the linked list
    protected static void displayLinkedList (ListNode_q28 head) {
        ListNode_q28 current = head;
        while (current!=null) {
            System.out.print(current.data+"->");
            current=current.next;
        } System.out.println("NULL");
    }
    // method to remove duplicate value from the linked list
    protected static void removeDuplicateValue (ListNode_q28 head) {
        ListNode_q28 current = head;
        while (current!=null && current.next!=null) {
            if (current.data==current.next.data) {
                current.next=current.next.next;
            } else  {
                current=current.next;
            }
        }
    }

    // main method
    public static void main(String[] args) throws InterruptedException
    {
        q28 q = new q28();
        q.head = new ListNode_q28(1);
        ListNode_q28 second = new ListNode_q28(1);
        ListNode_q28 third = new ListNode_q28(2);
        ListNode_q28 fourth = new ListNode_q28(3);
        ListNode_q28 fifth = new ListNode_q28(3);
        q.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = null;
        System.out.println("__Original Linked List__");
        q.displayLinkedList(q.head);
        System.out.println("Removing duplicate nodes from the linked list...");
        Thread.sleep(500);
        q.removeDuplicateValue(q.head);
        System.out.println("Updated Linked list");
        Thread.sleep(400);
        q.displayLinkedList(q.head);
    }
}