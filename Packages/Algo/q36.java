package Algo;
/* Insert node at beginning in doubly linked list */
public class q36
{
    private ListNode_q36 head;
    private ListNode_q36 tail;
    private int length;
    private static class ListNode_q36{
        private int data;
        private ListNode_q36 next;
        private ListNode_q36 prev;
        public ListNode_q36 (int data) {
            this.data = data;
        }
    }
    public q36 () {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    // method to check the linked list is empty or not
    protected boolean isEmpty() {return length==0;}
    //method to print elements forward
    protected void display_LinkedList_forward() {
        if (head==null) {
            return;
        }
        ListNode_q36 temp = head;
        while (temp!=null) {
            System.out.print(temp.data+"-->");
            temp = temp.next;
        } System.out.println("NULL");
    }
    // method to print element backward
    protected void display_LinkedList_backward() {
        if (tail==null) {
            return;
        }
        ListNode_q36 temp = tail;
        while (temp!=null) {
            System.out.print(temp.data+"<--");
            temp = temp.prev;
        } System.out.println("startNode");
    }
    // method to insert node at beginning of the linked list
    protected void insert_at_beginning(int value) {
        ListNode_q36 newNode = new ListNode_q36(value);
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.prev = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }
    // method to insert node at end of the linked list
    protected void insert_at_end(int value) {
        ListNode_q36 newNode = new ListNode_q36(value);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        newNode.prev = tail;
        tail = newNode;
        length++;
    }

    // main method
    public static void main(String[] args)
    {
        q36 q = new q36();
        q.insert_at_end(5);
        q.display_LinkedList_forward();
        q.insert_at_end(10);
        q.display_LinkedList_backward();
        q.insert_at_beginning(1); q.display_LinkedList_forward();
    }
}