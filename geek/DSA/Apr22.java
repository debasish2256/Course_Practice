package LinkedList;

import java.util.Arrays;

/*"1. Create a linked list and add the following elements to it - 2,4,1,3,8,5
Search for the number 3 and display its index

Output -> Found at 4th position

2. Create a liked list and add the following elements to it - 2,4,1,3,8,5.
Add the element 20 at the end 

Output - 2,4,1,3,8,5,20"
*/
public class Apr22 {
	static Node head;   
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public static int search(Node head, int data)
    {
        Node current = head; 
        int count=0;
        while (current != null)
        {
            if (current.data == data)
                return count;   
            current = current.next;
            count++;
        }
        return -1;   
    }
    private static void addLast(int data) {
		Node new_Node=new Node(data); 
        if (head == null) {
        	return;
        }else {
        	Node cur=head;
        	while(cur.next!=null) {
        		cur=cur.next;
        	}
        	cur.next=new_Node;
        }
	}
    
    public static void printlist()
    {
		Node last = null;
        while (head != null) {
            System.out.print(head.data + " ");
            last = head;
            head = head.next;
        }
        System.out.println();
    }
	
    public static void main(String args[])
    {
 
    	Apr22  llist = new Apr22 ();
        llist.push(10);
        llist.push(30);
        llist.push(11);
        llist.push(21);
        llist.push(14);
        System.out.println("Found Position:"+search(llist.head,30));
        Apr22.addLast(50);
        Apr22.addLast(500);
        printlist();

    }
    
}
