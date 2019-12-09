package linkedListDemo;

public class MyLinkedList {

	private Node head;


	public Node push(int data) {
		Node newNode = new Node(data);
		newNode.previous = head;
		newNode.previous = null;

		if (head != null)
			head.previous = newNode;

		head = newNode;
		return head;
	}
	
	

	static class Node {
		private int data;
		private Node next;
		private Node previous;

		Node(int data) {
			this.data = data;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public Node getPrevious() {
			return previous;
		}

		public void setPrevious(Node previous) {
			this.previous = previous;
		}

		@Override
		public String toString() {
			return String.valueOf(data);
		}
	}

}
