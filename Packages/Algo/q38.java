package Algo;

import java.util.NoSuchElementException;

/* How to delete last node of a doubly linked list */
public class q38
{
    private ListNode_q38 head;
    private ListNode_q38 tail;
    private int length;
    private class ListNode_q38 {
        private ListNode_q38 next;
        private ListNode_q38 prev;
        private final int data;
        public ListNode_q38 (int data) {
            this.data = data;
        }
    }
    public q38() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    // method to check Linked is empty or not
    protected boolean isEmpty() {return length==0;}
    // method to display Linked List forward
    protected void display_LinkedList_forward() {
        if (isEmpty()) {
            System.out.println("Linked List is empty");
        } else {
            ListNode_q38 temp = head;
            while (temp!=null) {
                System.out.print(temp.data+"-->");
                temp = temp.next;
            } System.out.println("NULL");
        }
    }
    // method to display Linked List backward
    protected void display_LinkedList_backward() {
        if (isEmpty()) {
            System.out.println("Linked List is empty");
        } else {
            ListNode_q38 temp = tail;
            while (temp!=null) {
                System.out.print(tail.data + "<--");
                temp = temp.prev;
            } System.out.println("startNode");
        }
    }
    // method to insert node at beginning
    protected void insert_at_beginning(int value) {
        ListNode_q38 newNode = new ListNode_q38(value);
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
        ListNode_q38 newNode = new ListNode_q38(value);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        newNode.prev = tail;
        tail = newNode;
        length++;
    }
    // method to delete the last node of the doubly Linked List
    protected void delete_last_node() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        ListNode_q38 temp = tail;
        if (head==tail) {
            head = null;
        } else {
            tail.prev.next = null;
        }
        tail = tail.prev;
        tail.prev = null;
        length--;
    }

    // main method
    public static void main(String[] args)
    {
        q38 q = new q38();
        q.insert_at_beginning(6);
        q.display_LinkedList_forward();
        q.insert_at_beginning(4);
        q.display_LinkedList_forward();
        q.insert_at_end(10);
        q.display_LinkedList_forward();
        q.display_LinkedList_backward();
        q.delete_last_node();
        q.display_LinkedList_forward();
    }
}