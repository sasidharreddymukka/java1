package sasidhar_1;

public class Double_Linked_List {

	class Node {
		int data;
		Node nextNode;
		Node previousNode;

		public Node(int data) {
			this.data = data;
		}
	}

	Node head = null;
	Node tail = null;
	int size = 0;

	public void insert(int data) {
		Node newNode = new Node(data);
		if (size == 0) {
			head = newNode;
			head.previousNode = null;

		} else if (size > 0) {
			tail.nextNode = newNode;
			newNode.previousNode = tail;

		}

		tail = newNode;
		size++;
		tail.nextNode = null;
	}

	public void addLast(int data) {
		Node node = new Node(data);
		if (tail != null) {
			tail.nextNode = node;
			node.previousNode = tail;
			node.nextNode = null;
			tail = node;
			size++;
		}
	}
public void addfirst(int data) {
	Node node = new Node(data);
	if (head!=null) {
		head.previousNode=node;
		node.nextNode=head;
		node.previousNode=null;
		head=node;
		
		size ++;
	}
	
}
	public int size() {
		Node temp = head;
		if (size == 0) {
			System.out.println("List is empty");
		}
		while (temp.nextNode != null) {

			temp = temp.nextNode;

		}
		size++;
		return size;
	}

	public void delete(int data) {

		if (size == 0) {
			System.out.println("List is empty");
			return;
		} else {
			if (head.data == data) {
				head = head.nextNode;
				head.previousNode = null;
				size--;
				return;
			} else {
				if (tail.data == data) {
					tail.previousNode = tail;
					tail.nextNode = null;
					size--;
					return;
				}
			}
		}
		Node temp = head;
		while (temp.nextNode != null) {
			if (temp.data == data) {
				temp.previousNode.nextNode = temp.nextNode;
				temp.nextNode.previousNode = temp.previousNode;
				return;
			} else {
				temp = temp.nextNode;
			}
			size--;
		}
	}

	public void display() {
		Node CurrentNode = head;
		if (head == null) {
			System.out.println("List is empty");
			return;
		} else {
			while (CurrentNode != null) {
				System.out.print(CurrentNode.data + " <-> ");
				CurrentNode = CurrentNode.nextNode;
			}

		}
		System.out.println("END");
	}

	public void display_rev() {
		Node last = tail;
		while (last != null) {
			System.out.print(last.data + " <-> ");
			last = last.previousNode;
		}
		System.out.println("START");
	}

	public static void main(String[] args) {
		Double_Linked_List obj = new Double_Linked_List();
		obj.insert(17);
		obj.insert(3);
		obj.insert(35);
		obj.insert(1);
		obj.insert(90);
		obj.insert(1);
		obj.addLast(90);
		obj.display();
		obj.delete(35);
		obj.addLast(6);
		obj.addfirst(1000);
		obj.display();
		obj.display_rev();
		System.out.println(obj.size());
	}

}
