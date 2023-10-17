package Algo;
/* How to represent Circular Linked List in java */
public class q39
{
    protected ListNode_q39 last;
    private final int length;
    private static class ListNode_q39 {
        private ListNode_q39 next;
        private final int data;
        public ListNode_q39(int data) {
            this.data = data;
        }
    }
    public q39() {
        last = null;
        length = 0;
    }
    public int getLength() {
        return length;
    }

    // method to display circular linked list
    protected void display(ListNode_q39 head) {
        ListNode_q39 current = head;
        if (head==null) {
            System.out.println("List is empty");
        } else {
            System.out.println("Nodes of the circular linked list:");
            do {
                System.out.print(current.data+"-->");
                current = current.next;
            } while (current!=head);
        }
    }
    // main method
    public static void main(String[] args)
    {
        q39 q = new q39();
        ListNode_q39 first = new ListNode_q39(1);
        ListNode_q39 second = new ListNode_q39(5);
        ListNode_q39 third = new ListNode_q39(10);
        ListNode_q39 fourth = new ListNode_q39(15);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;
        q.last = fourth;
        q.display(first);
    }
}