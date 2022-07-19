package rashmi;

import java.util.ArrayDeque;
import java.util.Deque;

class SuffledElements {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	/* Function to reverse the linked list */
	public static void arrange(Node head) {
		// defining a deque
		Deque<Integer> deque = new ArrayDeque<>();
		Node node = head;
		// push all the elements of linked list in to deque
		while (node != null) {
			deque.addLast(node.data);
			node = node.next;
		}
		node = head;
		int i = 0;
		// Alternatively push the first and last elements
		// from deque to back to the linked list and pop
		while (!deque.isEmpty()) {
			if (i % 2 == 0) {
				node.data = deque.removeFirst();
			} else {
				node.data = deque.removeLast();
			}
			i++;
			node = node.next;
		}
	}

	public Node getNewNode(int key) {
		Node a = new Node(key);
		a.next = null;
		a.data = key;
		return a;
	}

	public Node add(int key, Node node) {
		if (node == null)
			return getNewNode(key);
		else
			node.next = add(key, node.next);
		return node;
	}

	// printing the linked list
	static void printList(Node head) {
		Node node = head;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {
		SuffledElements a = new SuffledElements();
		// create linked list 1->2->3->4->5
		Node head = null;
		head = a.add(1, head);
		head = a.add(2, head);
		head = a.add(3, head);
		head = a.add(4, head);
		head = a.add(5, head);
		head = a.add(6, head);
		head = a.add(7, head);
		head = a.add(8, head);
		head = a.add(9, head);
		head = a.add(10, head);

		System.out.println("Given list are:");
		printList(head);
		arrange(head);
		System.out.println("\nRearrangement list are:");
		printList(head);
	}
}
