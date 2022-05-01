package LinkedList;

/*"1. Find the kth element in a linked list from the end of singlly linked list in :

1. Using two traversal 
2. In single traversal (using 2 pointer approch).


2. Reverse the last 3 nodes in a linked list

Input -     10->20->30->40->50->60->70
Output -   10->20->30>40>70->60->50"
*/
class Node1 {
	int data;
	Node1 next;

	Node1(int data, Node1 next) {
		this.data = data;
		this.next = next;
	}
}

public class Apr25 {
	static Node head;
	static Node1 head1;

	public static void main(String[] args) {
		for (int i = 25; i >= 5; i -= 5) {
			addFirst(i);
		}
		display();
		findKthFromLast(2);
		

		int traverseFrom=3;
		printList("Original linked list: ", head);
		head = computeReversal(head,traverseFrom);
		printList("Reversed linked list: ", head);
	}
	
	public static Node computeReversal(Node head,int from) {
		int count=countNodes(head);
		return reverse(head,count-from+1, count);
	}

	public static void printList(String msg, Node head) {
		System.out.print(msg);

		Node ptr = head;
		while (ptr != null) {
			System.out.print(ptr.data + " —> ");
			ptr = ptr.next;
		}

		System.out.println("null");
	}
	public static int countNodes(Node head) {
		int count=0;
		Node ptr = head;
		while (ptr != null) {
			count++;
			ptr = ptr.next;
		}
		return count;
	}

	public static Node reverse(Node head, int m, int n) {
		if (m > n) {
			return head;
		}

		Node prev = null;
		Node curr = head;

		for (int i = 1; curr != null && i < m; i++) {
			prev = curr;
			curr = curr.next;
		}

		Node start = curr;
		Node end = null;

		for (int i = 1; curr != null && i <= n - m + 1; i++) {
			Node next = curr.next;

			curr.next = end;
			end = curr;

			curr = next;
		}

		if (start != null) {
			start.next = curr;
			if (prev != null) {
				prev.next = end;
			} else {
				head = end;
			}
		}

		return head;
	}

	public static void addFirst(int data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public static void display() {
		if (head == null) {
			System.out.println("List is empty! ");
		} else {
			Node cur = head;
			while (cur != null) {
				System.out.print(cur.data + " ");
				cur = cur.next;
			}
			System.out.println();
		}
	}

	public static void findKthFromLast(int k) {
		if (head == null || head.next == null) {
			System.out.println("List is empty");
		} else { // Two traversal by calculating length
			int length = 0;
			Node currNode = head;
			Node nextNode = head;
			while (currNode != null) {
				length++;
				currNode = currNode.next;
			}
			if (k > length) {
				System.out.println(-1);
			} else {
				length = length - k;
				for (int i = 0; i < length; i++) {
					nextNode = nextNode.next;
				}
			}
			System.out.println("The " + k + " Node from last is " + nextNode.data);
		}

		// Two Pointer approach one traversal
		// else{
		// Node currNode = head;
		// Node nextNode = head;
		// for (int i=0;i<k;i++){
		// nextNode = nextNode.next;
		// }
		// while (nextNode!=null){
		// currNode = currNode.next;
		// nextNode = nextNode.next;
		// }
		// System.out.println(currNode.data);
		// }
	}
}
