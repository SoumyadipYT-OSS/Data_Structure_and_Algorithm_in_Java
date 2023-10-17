package Algo;
/*  How to find middle node in singly linked list */
public class q24
{
    private static ListNode_q24 head;
    private static class ListNode_q24 {
        private int data;
        private ListNode_q24 next;
        public ListNode_q24(int data) {     // constructor
            this.data=data;
            this.next=null;
        }
    }

    // method to display linked list
    static void display_linkedList (ListNode_q24 head) {
        ListNode_q24 current = head;
        while (current!=null) {
            System.out.print(current.data+"-->");
            current=current.next;
        }System.out.println("NULL");
    }

    // method to find the middle of the singly linked list
    static ListNode_q24 find_middle_Node(ListNode_q24 head) {
        ListNode_q24 secondPointer = head;
        ListNode_q24 firstPointer = head;
        if (head==null) {
            return null;
        }
        while (firstPointer!=null && firstPointer.next!=null) {
            secondPointer=secondPointer.next;
            firstPointer=firstPointer.next.next;
        }
        return secondPointer;
    }

    // main method
    public static void main(String[] args) throws InterruptedException
    {
        q24 q = new q24();
        q.head = new ListNode_q24(55);
        ListNode_q24 second = new ListNode_q24(47);
        ListNode_q24 third = new ListNode_q24(42);
        ListNode_q24 fourth = new ListNode_q24(12);
        // connecting all nodes of this linked list
        q.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=null;
        System.out.println("__Created Linked List__");
        q.display_linkedList(q.head);
        System.out.print("\n__Middle Node of this singly linked list is: ");
        Thread.sleep(800);
        ListNode_q24 midNode = q.find_middle_Node(q.head);
        System.out.println("Middle node is: "+midNode.data);
    }
}