package Algo;

import java.util.NoSuchElementException;

/* How to delete first node in a doubly Linked List in java*/
public class q37
{
    private ListNode_q37 head;
    private ListNode_q37 tail;
    private int length;
    private static class ListNode_q37{
        private final int data;
        protected ListNode_q37 next;
        protected ListNode_q37 prev;
        public ListNode_q37(int data) {
            this.data = data;
        }
    }
    public q37 () {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    // method to check Linked List is empty or not
    protected boolean isEmpty() {return length==0;}
    // method to display doubly Linked List forward
    protected void display_LinkedList_forward() {
        if (head==null) {
            System.out.println("New node to be inserted.");
        } else {
            ListNode_q37 temp = head;
            while (temp!=null) {
                System.out.print(temp.data+"-->");
                temp = temp.next;
            } System.out.println("NULL");
        }
    }
    // method to display doubly Linked List backward
    protected void display_LinkedList_backward() {
        if (tail==null) {
            System.out.println("New node to be inserted");
        } else {
            ListNode_q37 temp = tail;
            while (temp!=null) {
                System.out.print(temp.data+"<--");
                temp = temp.prev;
            } System.out.println("startNode");
        }
    }
    // method to insert node at beginning
    protected void insert_at_beginning(int value) {
        ListNode_q37 newNode = new ListNode_q37(value);
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.prev = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }
    // method to insert node at end
    protected void insert_at_end(int value) {
        ListNode_q37 newNode = new ListNode_q37(value);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        newNode.prev = tail;
        tail = newNode;
        length++;
    }
    // method to delete first node of doubly Linked List in java
    protected void delete_first_node() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        ListNode_q37 temp = head;
        if (head==tail) {
            tail = null;
        } else {
            head.next.prev = null;
        }
        head = head.next;
        temp.next = null;
        length--;
    }

    // main method
    public static void main(String[] args)
    {
        q37 q = new q37();
        q.insert_at_beginning(5);
        q.insert_at_end(10);
        q.insert_at_end(15);
        q.display_LinkedList_forward();
        q.delete_first_node();
        q.display_LinkedList_forward();
        q.display_LinkedList_backward();
        q.insert_at_beginning(1);
        q.display_LinkedList_forward(); q.display_LinkedList_backward();
    }
}