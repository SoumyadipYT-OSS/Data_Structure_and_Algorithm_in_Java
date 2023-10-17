package Algo;
/*  Find the length of a singly linked list */
public class q15
{
    private ListNode_q15 head;
    private static class ListNode_q15 {
        private int data;
        private ListNode_q15 next;
        public ListNode_q15(int data) {     // constructor
            this.data=data;
            this.next=null;
        }
    }

    // method to print the LinkedList
    static void printLinkedList (ListNode_q15 head) {
        ListNode_q15 current=head;
        while (current!=null) {
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("NULL");
    }

    // method to count the length of the singly linked list
    static int count_length_singlyLinked_List(ListNode_q15 head) {
        ListNode_q15 current = head;
        int count=0;
        while (current!=null) {
            count++;
            current=current.next;
        }
        return count;
    }

    // main method
    public static void main(String[] args)
    {
        q15 q = new q15();
        q.head = new ListNode_q15(54);
        ListNode_q15 second = new ListNode_q15(47);
        ListNode_q15 third = new ListNode_q15(89);
        ListNode_q15 fourth = new ListNode_q15(95);
        ListNode_q15 fifth = new ListNode_q15(84);
        // Creating a chain form to join the all nodes
        q.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        // calling the print the linked list method
        System.out.println("__You have created your linked list__");
        q.printLinkedList(q.head);
        // caliing the counting the linked list length
        System.out.print("Length of the singly linked list: "+q.count_length_singlyLinked_List(q.head));
    }
}