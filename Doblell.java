package sasidhar_1;

class New_Node {
	int data;
	New_Node next;
	New_Node prev;

	public New_Node(int data) {
		this.data = data;

	}
}

class Doublell {
	New_Node head = null;
	New_Node tail = null;
	int size = 0;

	public void insert(int data) {
		New_Node n = new New_Node(data);
		if (head == null) {
			head = tail = n;

			head.prev = null;
			tail.prev = null;
		} else {
			tail.next = n;
			n.prev = tail;
			tail = n;
		}

	}

	public void show() {
		  
		         
		        New_Node curnode = head;  
		        if(head == null) {  
		            System.out.println("List is empty");  
		            return;  
		        }  
		        System.out.println("Nodes of doubly linked list: ");  
		        while(curnode != null) {  
		             
		  
		            System.out.print(curnode.data + " ");  
		            curnode = curnode.next;  
		        }  
		    } 

	}


public class Doblell {
	public static void main(String[] args) {
		Doublell dll = new Doublell();
		dll.insert(1);
		dll.show();

	}
}
