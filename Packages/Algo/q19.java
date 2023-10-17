package Algo;
/*  Delete first node of a singly linked list */
public class q19
{
    private static ListNode_q19 head;
    private static class ListNode_q19 {
        private  int data;
        private ListNode_q19 next;
        public ListNode_q19 (int data) {
            this.data=data;
            this.next=null;
        }
    }

    // method to print the linked list
    static void display_LinkedList(ListNode_q19 head) {
        ListNode_q19 current = head;
        while (current!=null) {
            System.out.print(current.data+"-->");
            current=current.next;
        }System.out.println("NULL");
    }

    // method to delete the first node of a singly linked list
    public ListNode_q19 delete_first_Node() {
        if (head==null) {
            System.out.println("Nothing to delete!");
        }
        ListNode_q19 temp = head;
        assert head != null;
        head = head.next;
        temp.next=null;
        System.out.print("Successfully is deleted the first node ");
        return temp;
    }

    // main method
    public static void main(String[] args) throws InterruptedException{
        q19 q = new q19();
        q.head  = new ListNode_q19(45);
        ListNode_q19 second = new ListNode_q19(16);
        ListNode_q19 third = new ListNode_q19(42);
        // connecting the all nodes
        head.next=second;
        second.next=third;
        third.next=null;
        System.out.println("__Node created__");
        q.display_LinkedList(q.head);
        System.out.println("Deleting the first node...");
        Thread.sleep(2000);
        q.delete_first_Node();
        System.out.println("\n__Now printing the new linked list__");
        Thread.sleep(1000);
        q.display_LinkedList(q.head);
    }
}