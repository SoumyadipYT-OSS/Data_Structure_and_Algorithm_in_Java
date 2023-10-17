package Algo;
/* Represent doubly linked list in java */
public class q35
{
    private ListNode_q35 head;
    private ListNode_q35 tail;
    private int length;
    private class ListNode_q35 {
        private int data;
        private ListNode_q35 next;
        private ListNode_q35 prev;
        public ListNode_q35 (int data) {
            this.data =data;
        }
    }
    public q35 () {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    public boolean isEmpty () {
        return length == 0;
    }
    // method to print the elements of Doubly Linked List by forward
    protected void printElements_forward() {
        if (head==null) {
            return;
        }
        ListNode_q35 temp = head;
        while (temp!=null) {
            System.out.print(temp.data+"-->");
            temp = temp.next;
        } System.out.println("NULL");
    }
    // method to print the elements of doubly linked list by backwards
    protected void printElements_backward() {
        ListNode_q35 temp = tail;
        while (temp!=null) {
            System.out.print(temp.data+"<--");
            temp = temp.prev;
        } System.out.println("NULL");
    }
    // method to insert node at beginning in doubly linked list
    protected void insert_at_beginning_element(int value) {
        ListNode_q35 newNode = new ListNode_q35(value);
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.prev = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    // main method
    public static void main(String[] args)
    {
        q35 q = new q35();
        q.insert_at_beginning_element(1);
        q.printElements_forward();
        q.insert_at_beginning_element(10);
        q.printElements_forward();
        q.printElements_backward();
    }
}