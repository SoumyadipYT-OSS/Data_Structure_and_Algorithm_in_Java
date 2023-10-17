package Algo;
import java.util.Scanner;
/*  How to search an element in singly linked list */
public class q22
{
    private static ListNode_q22 head;
    private static class ListNode_q22 {
        private int data;
        private ListNode_q22 next;
        public ListNode_q22(int data) {     // constructor
            this.data=data;
            this.next=null;
        }
    }

    // method to display Linked List
    static void display_LinkedList(ListNode_q22 head) {
        ListNode_q22 current = head;
        while (current!=null) {
            System.out.print(current.data+"-->");
            current=current.next;
        }System.out.println("NULL");
    }

    // method to search the element from the linked list
    public static boolean search_element(int search_key) {
        ListNode_q22 current = head;
        if (head==null) {
            return false;
        }
        while (current!=null) {
            if (current.data==search_key) {
                return true;
            }
            current=current.next;
        }
        return false;
    }

    // main method
    public static void main(String[] args) throws InterruptedException
    {
        Scanner sc = new Scanner(System.in);
        q22 q = new q22();
        q.head = new ListNode_q22(45);
        ListNode_q22 second = new ListNode_q22(16);
        ListNode_q22 third = new ListNode_q22(52);
        ListNode_q22 fourth = new ListNode_q22(24);
        // connecting all nodes
        q.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=null;
        System.out.println("__Created Linked List__");
        q.display_LinkedList(q.head);
        System.out.print("\nEnter a key to find: ");
        int search_element = sc.nextInt();
        Thread.sleep(400);
        System.out.println("Finding the search element...");
        Thread.sleep(1500);
        if (q22.search_element(search_element)) {
            System.out.println("Search key found!!!");
        }
        else {
            System.out.println("Search key not found.");
        }
    }
}