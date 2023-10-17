package Algo;
/*  How to insert a node in a sorted Singly Linked List in Java ? */
public class q29
{
    private ListNode_q29 head;
    private static class ListNode_q29 {
        private int data;
        private ListNode_q29 next;
        public ListNode_q29 (int data) {
            this.data = data;
            this.next = null;
        }
    }

    // method to display the linked list
    protected void display_LinkedList (ListNode_q29 head) {
        ListNode_q29 current = head;
        while (current!=null) {
            System.out.print(current.data+"->");
            current = current.next;
        } System.out.println("NULL");
    }
    // method to insert a node in a sorted Singly Linked List
    protected void insert_node_sorted_linked_list (ListNode_q29 head, int value) {
        ListNode_q29 newNode = new ListNode_q29(value);
        ListNode_q29 current = head;
        ListNode_q29 temp = null;
        while (current!=null && current.data<newNode.data) {
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
    }
    // main method
    public static void main(String[] args)
    {
        q29 q = new q29();
        q.head = new ListNode_q29(1);
        ListNode_q29 second = new ListNode_q29(4);
        ListNode_q29 third = new ListNode_q29(5);
        ListNode_q29 fourth = new ListNode_q29(6);
        q.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;
        System.out.println("__Original Linked List__");
        q.display_LinkedList(q.head);
        q.insert_node_sorted_linked_list(q.head,3);
        System.out.println("Updated linked list:");
        q.display_LinkedList(q.head);
        q.insert_node_sorted_linked_list(q.head,2);
        System.out.println("Updated linked list:");
        q.display_LinkedList(q.head);
    }
}