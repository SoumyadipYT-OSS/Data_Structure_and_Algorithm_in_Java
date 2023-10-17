package Algo;
/* How to remove a given key from Singly Linked List in Java? */
public class q30 extends Thread
{
    private ListNode_q30 head;
    private static class ListNode_q30 {
        private int data;
        private ListNode_q30 next;
        public ListNode_q30 (int data) {
            this.data = data;
            this.next = null;
        }
    }
    // method to remove a given key from sinlgy linked list
    protected void remove_key_from_singly_linked_list (ListNode_q30 head,int key) {
        ListNode_q30 current = head;
        ListNode_q30 temp = null;
        while (current!=null && current.data!=key) {
            temp = current;
            current = current.next;
        } if (current==null) {
            System.out.println("Key doesn't found in the linked list.");
        }
        temp.next = current.next;
    }
    // method to display linked list
    protected void display_LinkedList (ListNode_q30 head) {
        ListNode_q30 current = head;
        while (current!=null) {
            System.out.print(current.data+"->");
            current = current.next;
        } System.out.println("NULL");
    }

    // main method
    public static void main(String[] args) throws InterruptedException
    {
        q30 q = new q30();
        q.head = new ListNode_q30(10);
        ListNode_q30 second = new ListNode_q30(20);
        ListNode_q30 third = new ListNode_q30(30);
        ListNode_q30 fourth = new ListNode_q30(38);
        ListNode_q30 fifth = new ListNode_q30(40);
        q.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = null;
        System.out.println("__Original Linked List__");
        q.display_LinkedList(q.head);
        System.out.println("Removing value 38 from the singly linked list...");
        Thread.sleep(800);
        q.remove_key_from_singly_linked_list(q.head,38);
        System.out.println("Successfully removed the key value!");
        Thread.sleep(900);
        System.out.println("Updated Linked List:");q.display_LinkedList(q.head);
    }
}