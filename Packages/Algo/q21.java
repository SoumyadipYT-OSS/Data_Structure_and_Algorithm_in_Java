package Algo;

import java.util.Scanner;

/*  Delete a node from a linked list from a given position */
public class q21
{
    private static ListNode_q21 head;
    private static class ListNode_q21 {
        private int data;
        private ListNode_q21 next;
        public ListNode_q21(int data) {
            this.data=data;
            this.next=null;
        }
    }

    // method to print the linked list
    static void display_LinkedList(ListNode_q21 head) {
        ListNode_q21 current = head;
        while (current!=null) {
            System.out.print(current.data+"-->");
            current=current.next;
        }System.out.print("NULL");
    }

    // method to delete a node at given position from linked list
    static void delete_Node_at_any_position(int position) {
        if (position==1) {
            head=head.next;
        }
        else {
            ListNode_q21 prev_node = head;
            int count=1;
            while (count<position-1) {
                prev_node=prev_node.next;
                count++;
            }
            ListNode_q21 current = prev_node.next;
            prev_node.next=current.next;
        }
    }

    @SuppressWarnings({"static-access"})
    // main method
    public static void main(String[] args) throws InterruptedException
    {
        Scanner sc = new Scanner(System.in);
        q21 q = new q21();
        q.head = new ListNode_q21(45);
        ListNode_q21 second = new ListNode_q21(77);
        ListNode_q21 third = new ListNode_q21(12);
        ListNode_q21 fourth = new ListNode_q21(23);
        ListNode_q21 fifth = new ListNode_q21(36);
        // connecting all nodes
        q.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        System.out.println("__Linked List__");
        q.display_LinkedList(q.head);
        System.out.print("\nEnter the position want to delete the node: ");
        int pos = sc.nextInt();
        System.out.println("Deleting the node...");
        Thread.sleep(1200);
        q.delete_Node_at_any_position(pos);
        System.out.println("Successfully deleted that node!!!");
        System.out.println("\nUpdating the linked list...");Thread.sleep(1000);
        System.out.println("__Updated Linked List__");
        q.display_LinkedList(q.head);
    }
}