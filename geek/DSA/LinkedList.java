package LinkedList;

import java.util.Scanner;

/*"1. Create a linked list and add ten values to it by taking it from the user. 
Delete all nodes which are greater than 40

2. Print the node which is at index 5

Input - 10->20->20->40->50->60->70->null
Output - 50

"
*/
public class LinkedList {
	static Node head;

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		for (int i = 0; i < 10; i++) {
			ll.push(new Scanner(System.in).nextInt());
		}
		/*ll.push(5);
		ll.push(12);

		ll.push(42);

		ll.push(45);
		ll.push(15);*/


		printList();
		deleteAllGreaterThan40();
		printList();
		System.out.println(printPositionData(3));

	}

	private static int printPositionData(int pos) {
		int count = 0;
		while (head != null) {
			if (count == pos) {
				return head.data;
			}
			count++;
			head = head.next;
		}
		return -1;
	}
	
	
	private static void deleteAllGreaterThan40() {
		if(head!=null) {
			Node cur=head;
			while(cur.next!=null) {
				if(cur.next.data>40) {
					Node prev=cur;
					prev.next=cur.next.next;
				}
				cur=cur.next;
			}
		}
		
	}

	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	public static void printList()
    {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

}
