import java.util.*;
public class listmerge 
{
 
    private static class Node {
        private int data;
        Node next;
 
        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
 
    Node head;
 
    public static void main(String[] args) {
        listmerge list = new listmerge();
 
        int[] data1 = { 10, 30, 50 };
        Node head1 = new Node(data1[0]);
        for (int i = 1; i < data1.length; i++)
            list.push(head1, data1[i]);
        System.out.println("First List : ");
        list.display(head1);
 
        int[] data2 = { 20, 40, 60 };
        Node head2 = new Node(data2[0]);
        for (int count = 1; count < data2.length; count++)
            list.push(head2, data2[count]);
        System.out.println("Second List : ");
        list.display(head2);
 
        Node n = list.mergeSortedLists(head1, head2);
        System.out.println("Merged List : ");
        list.display(n);
    }
 
    public Node mergeSortedLists(Node first, Node second) {
        Node head;
        if (first == null)
            return second;
        else if (second == null)
            return first;
        else if (first.data < second.data) {
            head = first;
            head.next = mergeSortedLists(first.next, second);
        } else {
            head = second;
            head.next = mergeSortedLists(first, second.next);
        }
        return head;
    }
 
    public void push(Node head, int n) {
        while (head.next != null)
            head = head.next;
        head.next = new Node(n);
    }
 
    public void display(Node head) {
        Node tempDisplay = head; // start at the beginning of linkedList
        while (tempDisplay != null) { // Until we don't find end of list.
            System.out.println(tempDisplay.data);
            tempDisplay = tempDisplay.next; // move to next Node
        }
    }
 
}