package Algo;
import java.util.Scanner;

/* How to find the nth node from the end of the singly linked list */
public class q25
{
    private static ListNode_q25 head;
    private static class ListNode_q25 {
        private int data;
        private ListNode_q25 next;
        public ListNode_q25(int data) {
            this.data=data;
            this.next=null;
        }
    }


    // method to display the linked list
    static void display_LinkedList(ListNode_q25 head) {
        ListNode_q25 current = head;
        while (current!=null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }System.out.println("NULL");
    }

    // method to find the nth node from the end of the linked list
    public static ListNode_q25 find_Nth_node_from_end(int Nth_val) throws Exception {
        if (head==null) {
            return null;
        }
        if (Nth_val<=0) {
            throw  new IllegalAccessException("Invalid value");
        }
        ListNode_q25 mainPointer=head;
        ListNode_q25 referencePointer=head;
        int count=0;
        while (count<Nth_val) {
            if (referencePointer==null) {
                throw new IllegalArgumentException("Invalid input!");
            }
            referencePointer=referencePointer.next;
            count++;
        }
        while (referencePointer != null) {
            referencePointer=referencePointer.next;
            mainPointer=mainPointer.next;
        }
        return mainPointer;
    }

    // main method
    public static void main(String[] args) throws Exception,InterruptedException
    {
        Scanner sc = new Scanner(System.in);
        q25 q = new q25();
        q.head = new ListNode_q25(42);
        ListNode_q25 second = new ListNode_q25(16);
        ListNode_q25 third = new ListNode_q25(23);
        ListNode_q25 fourth = new ListNode_q25(44);
        ListNode_q25 fifth = new ListNode_q25(48);
        ListNode_q25 sixth = new ListNode_q25(22);
        ListNode_q25 seventh = new ListNode_q25(12);
        ListNode_q25 eigth = new ListNode_q25(33);
        ListNode_q25 ninth = new ListNode_q25(20);
        ListNode_q25 tenth = new ListNode_q25(10);
        // connecting all nodes
        q.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        sixth.next=seventh;
        seventh.next=eigth;
        eigth.next=ninth;
        ninth.next=tenth;
        tenth.next=null;
        System.out.println("__Created Linked List__");
        q.display_LinkedList(q.head);
        System.out.print("\nEnter to find the nth node from the end: ");
        int nth_value = sc.nextInt();
        System.out.println("\nFinding the node position...");
        Thread.sleep(1200);
        System.out.print("The node is present from the end of the linked list:\nValue of the node: "+q.find_Nth_node_from_end(nth_value).data);
        q.find_Nth_node_from_end(nth_value);
        System.out.println(", at position: "+nth_value+" from the end of the singly linked list");
    }
}